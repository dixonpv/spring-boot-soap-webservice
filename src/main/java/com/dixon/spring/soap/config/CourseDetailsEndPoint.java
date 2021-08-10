/**
 * 
 */
package com.dixon.spring.soap.config;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dixon.courses.CourseDetails;
import com.dixon.courses.GetCourseDetailsRequest;
import com.dixon.courses.GetCourseDetailsResponse;

/**
 * @author dixon
 *
 */
@Endpoint
public class CourseDetailsEndPoint {
	
	@PayloadRoot(namespace="http://dixon.com/courses", localPart="GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourse(@RequestPayload GetCourseDetailsRequest request) {
		
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Ruby On Rails");
		response.setCourseDetails(courseDetails);
		return response;
		
	}

}
