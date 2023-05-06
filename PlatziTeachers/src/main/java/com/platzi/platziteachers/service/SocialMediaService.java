package com.platzi.platziteachers.service;

import java.util.List;

import com.platzi.platziteachers.model.SocialMedia;
import com.platzi.platziteachers.model.TeacherSocialMedia;

public interface SocialMediaService {
	
	void save(SocialMedia socialMedia);
	
	List<SocialMedia> findAllSocialMedias();
	
	void deleteSocialMediaById(Long socialMediaId);
	
	void updateSocialMedia(SocialMedia socialMedia);	
	
	SocialMedia findById(Long idSocialMedia);
	
	SocialMedia findByName(String name);
	
	TeacherSocialMedia findSocialMediaByIdAndNickName(Long idSocialMedia, String nickName);
}
