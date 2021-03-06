package com.franchaining.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.franchaining.dao.ManagerDAO;
import com.franchaining.vo.ManagerVO;
import com.franchaining.vo.RegVO;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Inject
	private ManagerDAO dao;

	@Override
	public void register(RegVO regVO) throws Exception {
		dao.register(regVO);
	}

	@Override
	public ManagerVO login(ManagerVO managerVO) throws Exception {
		return dao.login(managerVO);
	}

	@Override
	public ManagerVO regchk(ManagerVO managerVO) throws Exception {
		return dao.regchk(managerVO);
	}

	@Override
	public List<ManagerVO> regwait() throws Exception {

		return dao.regwait();
	}

	@Override
	public void regupdate(ManagerVO managerVO) throws Exception {
		dao.regupdate(managerVO);
	}

	@Override
	public int MflagCount(int m_flag) throws Exception {
		return dao.MflagCount(m_flag);
	}

	@Override
	public void hasEnoReg(RegVO regVO) throws Exception {
		dao.hasEnoReg(regVO);
		
	}

	@Override
	public int mflagChk(int e_no) throws Exception {
		return dao.mflagChk(e_no);
	}
}
