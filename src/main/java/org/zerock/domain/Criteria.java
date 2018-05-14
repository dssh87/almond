package org.zerock.domain;

import lombok.Data;

@Data

public class Criteria {

	private int page;
	//검색
/*	private String type;
	private String keyword;

	public String[] getArr() {
		if (type == null) {
			return null;
		}
		return this.type.split("");
	}
*/
	public Criteria() {
		this.page = 1;
	}

	public Criteria(int page) {
		this.page = page;
	}

	public int getSkip() {
		return (this.page - 1) * 10;
	}

}
