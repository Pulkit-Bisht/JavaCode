package com.studentcrud.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentcrud.dao.StudentDao;
import com.studentcrud.entity.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public boolean addStudent(Student student) {
		Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cr = cb.createQuery(Student.class);
        Root<Student> root = cr.from(Student.class);
        List<Predicate> andPredicates = new ArrayList<Predicate>();
        andPredicates.add(cb.equal(root.get("address"), student.getAddress()));
        andPredicates.add(cb.equal(root.get("mobNo"), student.getMobNo()));
        Predicate andPredicate = cb.and(andPredicates.toArray(new Predicate[]{}));
        cr.select(root).where(cb.and(andPredicate));
        Query<Student> query = session.createQuery(cr);
        List<Student> results = query.getResultList();
        if (results != null && results.size() > 0) {
            session.flush();
            session.clear();
            return false;
        }
        session.save(student);
        session.flush();
        session.clear();
        return true;
	}

	@Override
	public boolean updateStudent(Student student) {
		Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cr = cb.createQuery(Student.class);
        Root<Student> root = cr.from(Student.class);
        List<Predicate> andPredicates = new ArrayList<Predicate>();
        andPredicates.add(cb.equal(root.get("id"), student.getId()));
        Predicate andPredicate = cb.and(andPredicates.toArray(new Predicate[]{}));
        cr.select(root).where(cb.and(andPredicate));
        Query<Student> query = session.createQuery(cr);
        List<Student> results = query.getResultList();
        if (results != null && results.size() > 0) {
            session.merge(student);
            session.flush();
            session.clear();
            return false;
        }

        session.flush();
        session.clear();
        return true;
	}

	@Override
	 public List<Student> getAllStudent() {
	        Session session = entityManager.unwrap(Session.class);
	        CriteriaBuilder cb = session.getCriteriaBuilder();
	        CriteriaQuery<Student> cr = cb.createQuery(Student.class);
	        Root<Student> root = cr.from(Student.class);
	        List<Predicate> andPredicates = new ArrayList<Predicate>();
	        Predicate andPredicate = cb.and(andPredicates.toArray(new Predicate[]{}));
	        cr.select(root).where(andPredicate);
	        Query<Student> query = session.createQuery(cr);
	        List<Student> results = query.getResultList();
	        session.flush();
	        session.clear();
	        return results;
	    }

	@Override
	public Student getStudentById(Integer id) {
		Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        Student student = (Student) session.get(Student.class, id);
        return student;
		
	}
}
