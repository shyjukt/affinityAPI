package com.affinity.awas.support;

import java.util.List;

public class SearchResult<T> {
	private long totalRecords;
	private List<T> searchList;
	
	

	public SearchResult() {

	}

	public SearchResult(long totalRecords, List<T> searchList) {
		this.totalRecords = totalRecords;
		this.searchList = searchList;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<T> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<T> searchList) {
		this.searchList = searchList;
	}

	
}
