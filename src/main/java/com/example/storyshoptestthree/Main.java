package com.example.storyshoptestthree;

import com.example.storyshoptestthree.entity.StudentEntity;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
     /*   StudentEntity student_1 = new StudentEntity();
        StudentEntity student_2 = new StudentEntity();
        StudentEntity student_3 = new StudentEntity();*/



      /*  student_1.setFirstName("Vasy");
        student_1.setLastName("Petrov");

        student_2.setFirstName("Vasy_2");
        student_2.setLastName("Petrov_2");

        student_3.setFirstName("Vasy_3");
        student_3.setLastName("Petrov_3");


        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction();
        session.save(student_1);
        session.save(student_2);
        session.save(student_3);
        session.close();*/


        Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(StudentEntity.class);

        Root<StudentEntity> root = criteriaQuery.from(StudentEntity.class);
        log.info("Root<StudentEntity> root ");
        Selection[] selections = {root.get("id"),root.get("firstName")};

        criteriaQuery.select(criteriaBuilder.construct(StudentEntity.class, selections));
        criteriaQuery.select(root)
                .where(criteriaBuilder.like(root.<String>get("firstName"),"Vas%"));
                //.where(criteriaBuilder.equal(root.<String>get("student_first_name"),"Vasy"));

        Query query = session.createQuery(criteriaQuery);
        List<StudentEntity> entityList = query.getResultList();
        session.close();

        entityList.forEach(e-> System.out.println(e));
    }








}
