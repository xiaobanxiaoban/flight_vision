package com.ban.flight.controller;

import com.ban.flight.form.AdsbForm;
import com.ban.flight.manager.AdsbManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaoban on 2017/3/22.
 */
@Controller
@RequestMapping("adsb")
public class AdsbController {

	@Autowired
	private AdsbManager adsbManager;

	@RequestMapping("upload")
	public void upload(@ModelAttribute AdsbForm adsbForm){
		adsbManager.upload(adsbForm);
	}
}
