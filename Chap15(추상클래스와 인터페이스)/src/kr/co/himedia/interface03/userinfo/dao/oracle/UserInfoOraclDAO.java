package kr.co.himedia.interface03.userinfo.dao.oracle;

import kr.co.himedia.interface03.userinfo.UserInfoDTO;
import kr.co.himedia.interface03.userinfo.dao.UserInfoDAO;

public class UserInfoOraclDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("instert into ORACLE DB userid = "+ userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println(" updat ORACLE DB userid = "+ userInfoDTO.getUserId());
		
	}

	@Override
	public void daleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("dalet ORACLE DB userid = "+ userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select ORACLE DB userid = "+ userInfoDTO.getUserId());
		
	}

}
