package es.fiturjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import es.fiturjc.model.Category;
import es.fiturjc.model.Course;
import es.fiturjc.model.Facilities;
import es.fiturjc.model.User;
import es.fiturjc.repository.CourseRepository;
import es.fiturjc.repository.FacilitiesRepository;
import es.fiturjc.repository.UserRepository;

@Controller
public class DatabaseUsage implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private FacilitiesRepository facilitiesRepository;

	@Override
	public void run(String... arg0) throws Exception {

		User user1 = new User("William", "Wallace", 25, "pass", "ww@gmail.com", "por escocia", "WW", "ROLE_USER");
		user1.setImgSrc("/uploads/img/default");
		User user2 = new User("Chemi", "G", 99, "pass", "chemi@email.com", "uee", "chemg", "ROLE_USER");
		user2.setImgSrc("/uploads/img/default");
		User user3 = new User("Cucu", "tras", 99, "pass", "chemi2@email.com", "uee", "cucutras", "ROLE_USER");
		user3.setImgSrc("/uploads/img/default");
		Course course1 = new Course("Aerobic", Category.CARDIO, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course2 = new Course("Body Combat", Category.CARDIO, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course11 = new Course("Boxing", Category.CARDIO, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course12 = new Course("Cardio", Category.CARDIO, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course13 = new Course("CrossFit", Category.CARDIO, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course14 = new Course("Dumbbells", Category.CARDIO, "blablacar", "10:00-11:00", "15:00-16:00");
		// STRENGTH CATEGORIES
		Course course3 = new Course("Phisical Therapy", Category.STRENGTH, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course4 = new Course("Pilates", Category.STRENGTH, "blablacar", "10:00-11:00", "15:00-16:00");
		// FREESTYLE CATEGORIES
		Course course5 = new Course("Spinning", Category.FREESTYLE, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course6 = new Course("Step", Category.FREESTYLE, "blablacar", "10:00-11:00", "15:00-16:00");
		// DANCE CATEGORIES
		Course course7 = new Course("Swiming", Category.DANCE, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course8 = new Course("Switching circuit", Category.DANCE, "blablacar", "10:00-11:00", "15:00-16:00");
		// MIND CATEGORIES
		Course course9 = new Course("Training", Category.MIND, "blablacar", "10:00-11:00", "15:00-16:00");
		Course course10 = new Course("Yoga", Category.MIND, "blablacar", "10:00-11:00", "15:00-16:00");

		courseRepository.save(course1);
		courseRepository.save(course2);
		courseRepository.save(course3);
		courseRepository.save(course4);
		courseRepository.save(course5);
		courseRepository.save(course6);
		courseRepository.save(course7);
		courseRepository.save(course8);
		courseRepository.save(course9);
		courseRepository.save(course10);
		courseRepository.save(course11);
		courseRepository.save(course12);
		courseRepository.save(course13);
		courseRepository.save(course14);

		user2.addCourse(course1);

		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);

		for (int i = 1; i <= 40; i++) {
			facilitiesRepository.save(new Facilities("/img/facilities/facilities_" + i + ".jpeg"));
		}

	}

}
