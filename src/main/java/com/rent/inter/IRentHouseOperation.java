package com.rent.inter;

import com.rent.model.RentHouse;

public interface IRentHouseOperation {

	/**按主键查询**/
	public RentHouse selectHouseById(Long id);
}
