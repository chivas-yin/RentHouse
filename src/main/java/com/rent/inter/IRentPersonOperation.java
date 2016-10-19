package com.rent.inter;

import com.rent.model.RentPerson;

public interface IRentPersonOperation {
	
	/**按主键查询**/
	public RentPerson selectPersonById(Long rpKey);

}
