package com.callor.images.service.impl;

import java.io.File;
import java.util.List;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.images.config.QualifierConfig;
import com.callor.images.service.FileUpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.FILE_V1)
public class FileServiceImplV1 implements FileUpService{
	
	private final ResourceLoader resLoader;
	public FileServiceImplV1(ResourceLoader resLoader) {
		// TODO Auto-generated constructor stub
		this.resLoader =  resLoader;
		
	}
	
	@Override
	public String fileUp(MultipartFile file) throws Exception {
		// TODO Auto-generated method stub
	
		// 1. file 변수에 파일 관련 정보가 있는지 검사
		// 없으면 더이상 진행하지 말라
		if(file == null) {
			return null;
		}
		
		// 2. 파일 저장할 폴더 정보 수집
		// 프로젝트 폴더가 아니고 서버가 실행될 때 서버의 폴더정보 가져오기
		String upLoadPath = resLoader.getResource("/static/upload")
										.getURI()
										.getPath();
		log.debug("업로드폴더 {}",upLoadPath);
		
		// 3. 업로드 할 파일의 이름 추출
		String fileName = file.getOriginalFilename();
		
		// 4. 업로드할 폴더가 있는지 검사하여 없으면 생성하기
		// java.io.File
		File dir = new File(upLoadPath);
		
		if(!dir.exists()) {
			// 4-1. 폴더 생성하기
			dir.mkdirs();
		}
										
		
		
		return null;
	}

	@Override
	public List<String> filesUp(MultipartHttpServletRequest files) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fileDelete(String filename) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	
	
}
