package online.smartcompute.demoapp.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import online.smartcompute.dempapp.model.Student;
import online.smartcompute.logging.AppLogger;

@RestController
public class DemoController {

	private static final AppLogger LOGGER = AppLogger.logger(DemoController.class);

	@RequestMapping(value = "/students/{studentid}", method = RequestMethod.GET, produces = "application/json")
	public Student getStudentDetails(
			@ApiParam(value = "is of the student", required = true) @PathVariable(value = "studentid", required = true) int studentid) {
		LOGGER.appendStartLog("sayHello");
		Student student = new Student();

		student.setId(studentid);
		
		
		System.out.println("ddd");

		return student;
	}

}
