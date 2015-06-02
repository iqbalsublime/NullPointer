package com.sublime.np.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sublime.np.entity.Shop;

@Controller
public class JSONController {

	@RequestMapping(value = "iqbal", method = RequestMethod.GET)
	public @ResponseBody String getShopInJSON() {

		Shop shop = new Shop();
		shop.setName("G");
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });
		return shop.toString();

	}

}