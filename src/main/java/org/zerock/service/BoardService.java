package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {

	public List<BoardVO> list(Criteria cri) throws Exception;

	public int getTotal(Criteria cri) throws Exception;

}
