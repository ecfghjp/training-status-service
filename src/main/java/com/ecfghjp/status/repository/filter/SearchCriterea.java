package com.ecfghjp.status.repository.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SearchCriterea {

	private String key;
	private Object value;
	private SearchOperation operation;

}
