package com.zhongrun.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.zhongrun.common.web.controller.BaseController;
import com.zhongrun.model.Ad;
import com.zhongrun.model.Admin;
import com.zhongrun.model.Resource;
import com.zhongrun.service.IAdminService;

@Scope("prototype")
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

	@Autowired
	@Qualifier("adminService")
	private IAdminService adminService;
	/**
	 * model view 返回jsp 页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ModelAndView login(String username, String password, String checkcode) {
		
		ModelAndView mv = new ModelAndView("/index");
		List<Admin> adminList = adminService.getAdminsByName(username);
		if(adminList.size() < 1){
			//用户不存在
		}else{
			
		}
		/*
		 * List<Ad> adList = new ArrayList<Ad>(); for(int i=0;i<8;i++){ Ad ad =
		 * new Ad(); ad.setActionType(1); ad.setAdAddTime(new
		 * Date().toString()); ad.setAdName("AAA"+i); adList.add(ad); }
		 * 
		 * mv.addObject("adList", adList);
		 */
		Integer adminId = adminList.get(0).getAdminId();
		List<Resource> resList = adminService.getReourcesByAdmin(4);
		mv.addObject("resList", resList);
		return mv;
	}

	/**
	 * 输出json 数据
	 * 
	 * @return
	 */
	@RequestMapping(value = "/adjson", method = { RequestMethod.GET })
	@ResponseBody
	public Object rtJson() {
		List<Ad> adList = new ArrayList<Ad>();
		for (int i = 0; i < 8; i++) {
			Ad ad = new Ad();
			adList.add(ad);
		}
		return adList;
	}

	@RequestMapping(value = "/adanalize", method = { RequestMethod.GET })
	public String analizData() {

		return "highchartsDemo/hichartsdemo";
	}

	@RequestMapping(value = "/uploadPhoto", method = { RequestMethod.POST })
	public String uploadPhoto(@RequestParam MultipartFile[] photos) {
		for (MultipartFile file : photos) {
			System.out.println(file.getName() + "  " + file.getSize());

		}

		return "";
	}

	private static final String FILE_PATH = "D:/uploaddir";

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// String fileName = (String)request.getAttribute("filename");
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Iterator<String> fileNames = multipartRequest.getFileNames();
		MultipartFile multipartFile = multipartRequest
				.getFile(fileNames.next());
		// 如果使用firebug，或者chrome的开发者工具，可以看到，这个文件上传工具发送了两个文件名
		// 分别是：name="Filedata"; filename="AVScanner.ini"
		// 用这两个文件名获得文件内容都可以，只不过第一个没有后缀，需要自己处理
		// 第二个是原始的文件名，但是这个文件名有可能是上传文件时的全路径
		// 例如 C:/testssh/a.log，如果是全路径的话，也需要处理
		String fileAlias = multipartFile.getName();
		System.out.println("Spring MVC获得的文件名：" + fileAlias);
		// 获得文件原始名称
		String name = multipartFile.getOriginalFilename();
		String filePath = FILE_PATH + "/" + name;
		saveFile(filePath, multipartFile.getBytes());
		Map<String, String> resultMap = new HashMap<String, String>(5);
		resultMap.put("result", "success");
		resultMap.put("filePath", filePath);
		return JSON.toJSONString(resultMap);
	}

	// 保存文件的方法
	public void saveFile(String filePath, byte[] content) throws IOException {
		BufferedOutputStream bos = null;
		try {
			File file = new File(filePath);
			// 判断文件路径是否存在
			if (!file.getParentFile().exists()) {
				// 文件路径不存在时，创建保存文件所需要的路径
				file.getParentFile().mkdirs();
			}
			// 创建文件（这是个空文件，用来写入上传过来的文件的内容）
			file.createNewFile();
			bos = new BufferedOutputStream(new FileOutputStream(file));
			bos.write(content);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("文件不存在。");
		} finally {
			if (null != bos) {
				bos.close();
			}
		}
	}
}
