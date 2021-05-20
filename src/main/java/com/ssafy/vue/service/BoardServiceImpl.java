package com.ssafy.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.vue.dao.BoardMapper;
import com.ssafy.vue.dao.CommentMapper;
import com.ssafy.vue.dto.BoardDto;
import com.ssafy.vue.dto.CommentDto;

@Service
public class BoardServiceImpl implements BoardService {
	
    @Autowired
	private BoardMapper bDao;
    
    @Autowired
    private CommentMapper cDao;

    @Override
	public List<BoardDto> retrieveBoard() {
		return bDao.selectBoard();
	}
    
    @Override
	public List<String> retrieveWriter() {
		return bDao.writerList();
	}
    
  	@Override
	public boolean writeBoard(BoardDto board) {
		return bDao.insertBoard(board) == 1;
	}

	@Override
	public BoardDto detailBoard(int no) {
		return bDao.selectBoardByNo(no);
	}

	@Override
	@Transactional
	public boolean updateBoard(BoardDto board) {
		return bDao.updateBoard(board) == 1;
	}

	@Override
	@Transactional
	public boolean deleteBoard(int no) {
		return bDao.deleteBoard(no) == 1;
	}

	@Override
	public List<CommentDto> getCmtList(int bno) {
		return cDao.cmtList(bno);
	}

	@Override
	public boolean writeComment(CommentDto comment) {
		return cDao.insertComment(comment) == 1;
	}

	@Override
	public boolean updateComment(CommentDto comment) {
		return cDao.updateComment(comment) == 1;
	}

	@Override
	public boolean deleteComment(int no) {
		return cDao.deleteComment(no) == 1;
	}

}