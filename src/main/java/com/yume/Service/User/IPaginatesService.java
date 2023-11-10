package com.yume.Service.User;

import org.springframework.stereotype.Service;

import com.yume.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}
