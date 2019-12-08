package com.test.utils;

import java.util.List;

/**
 * @author Administrator
 *
 * @param <T>
 */
public class PagedData<T> {

	public PagedData(int pageIndex,int pageSize, int totalCount, List<T> list) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.list = list;
		this.totalPageCount = this.totalCount % this.pageSize == 0?
				this.totalCount / this.pageSize : this.totalCount / this.pageSize+1;
	}
	private int pageIndex;
	private int pageSize;
	private int totalCount;
	private int totalPageCount;
	private List<T> list;
	private boolean hasPrevious;
	private boolean hasNext;


	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public boolean isHasPrevious() {
		if (this.pageIndex > 1) {
			return true;
		}
		return false;
	}
	public boolean isHasNext() {
		if (this.pageIndex < this.totalPageCount) {
			return true;
		}
		return false;
	}


}
