package com.zhongrun.common.pagination;

import java.util.List;


/**
 * 查询返回所有记录的分页实现.
 * 
 * @version 1.0, 2010-4-3
 */
public class PageContext2<E> implements IPageContext<E>{

	private int totalRecords;//总记录数
    private int pageSize;//每页包含的记录数
    private List<E> items;//当前页记录
    
    public PageContext2(List<E> items,int totalRecords) {
        this(items, DEFAULT_PAGE_SIZE, totalRecords);
    }
    
    public PageContext2(List<E> items, int pageSize, int totalRecords) {
        /*if (items == null) {
            throw new IllegalArgumentException("Items should not be null!");
        }*/
        this.items = items;
        this.pageSize = pageSize;
        this.totalRecords = totalRecords;
    }
    
    public Page<E> getPage(int index) {
        Page<E> page = new Page<E>();
//        List<E> pageItems = new ArrayList<E>();
        page.setContext(this);
        page.setHasNext(index < getPageCount());
        page.setHasPre(index > 1);
        page.setIndex(index);
        
        List<E> items = getItems();
        int total = getTotalRecords();
        int start = (index - 1) * getPageSize();
        if (start > total - 1) {
            start = 0;
            page.setHasPre(false);
            page.setIndex(1);
        }
        int toIndex = start + getPageSize();
        if (toIndex > total) {
            toIndex = total;
        }
        
//        pageItems = items.subList(start, toIndex);
        page.setItems(items);
        return page;
    }

    /**
     * 计算总页数.
     * 
     * @return
     */
    public int getPageCount() {
        int size = getTotalRecords();
        int div = size / getPageSize();
        int result = (size % getPageSize() == 0) ? div : div + 1;
        
        return result;
    }

    public int getPageSize() {
        if (this.pageSize <= 0) {
            this.pageSize = DEFAULT_PAGE_SIZE;
        }
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<E> getItems() {
        return this.items;
    }

    public void setItems(List<E> items) {
        this.items = items;
    }
    
    public int getTotal() {
        return getItems().size();
    }

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
    
}
