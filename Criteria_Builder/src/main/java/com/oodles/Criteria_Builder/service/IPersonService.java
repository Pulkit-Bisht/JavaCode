package com.oodles.Criteria_Builder.service;

import com.oodles.Criteria_Builder.entities.Person;
import com.oodles.Criteria_Builder.model.request.PersonRequestModel;
import com.oodles.Criteria_Builder.model.request.PersonSearchRequestModel;
import com.oodles.Criteria_Builder.model.response.PersonResponseModel;


import java.util.List;


public interface IPersonService {

    PersonResponseModel addPerson(PersonRequestModel personRequestModel);

    List<Person> searchPerson(PersonSearchRequestModel personSearchRequestModel);

}