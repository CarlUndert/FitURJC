package es.fiturjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import es.fiturjc.model.Facilities;
import es.fiturjc.repository.FacilitiesRepository;

@Service
public class FacilitiesService {
	@Autowired
	private FacilitiesRepository facilitiesRepository;

	public Page<Facilities> getFacilities(Pageable page) {
		return facilitiesRepository.findAll(page);
	}
	public Page<Facilities> moreFacilities(int page) {
		return facilitiesRepository.findAll(new PageRequest(page, 10));
	}
	public Page<Facilities> getFacilities() {
		return facilitiesRepository.findAll(new PageRequest(0, 10));
	}
}
