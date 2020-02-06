package com.architecture.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.architecture.model.Building;
import com.architecture.service.BuildingService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonController {

	public static void sendBuilding(HttpServletRequest req, HttpServletResponse res) {
		Building b = BuildingService.getById(
				Integer.parseInt(
						req.getParameter("id")));
		
//		ObjectMapper om = new ObjectMapper();
		try {
			res.getWriter()
				.write(
					new ObjectMapper()
					.writeValueAsString(b));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
