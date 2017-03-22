package com.ban.flight.service.service;

import com.ban.flight.service.document.Adsb;
import com.ban.flight.service.repository.AdsbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoban on 2017/3/22.
 */
@Service
public class AdsbService {

	@Autowired
	private AdsbRepository adsbRepository;

	public void upload(Adsb adsb) {
		adsbRepository.save(adsb);
	}
}
