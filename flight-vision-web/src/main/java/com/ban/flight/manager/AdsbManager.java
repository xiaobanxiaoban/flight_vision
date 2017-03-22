package com.ban.flight.manager;

import com.ban.flight.form.AdsbForm;
import com.ban.flight.service.document.Adsb;
import com.ban.flight.service.service.AdsbService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoban on 2017/3/22.
 */
@Service
public class AdsbManager {

	@Autowired
	private MapperFacade mapperFacade;

	@Autowired
	private AdsbService adsbService;

	public void upload(AdsbForm adsbForm){
		Adsb adsb=mapperFacade.map(adsbForm,Adsb.class);
		adsbService.upload(adsb);
	}
}
