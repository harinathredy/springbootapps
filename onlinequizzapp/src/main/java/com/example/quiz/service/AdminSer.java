package com.example.quiz.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.bean.Admin;
import com.example.quiz.bean.Question;
import com.example.quiz.bean.Quiz;
import com.example.quiz.bean.Statistics;
import com.example.quiz.repository.AdminRepo;
import com.example.quiz.repository.Questionrepo;
import com.example.quiz.repository.Quizrepo;
import com.example.quiz.repository.Userrepo;

@Service
public class AdminSer {
@Autowired
Questionrepo qr;
@Autowired
Quizrepo qur;
@Autowired
Userrepo ur;
@Autowired
Statistics stat;
@Autowired
AdminRepo adr;
public String adminLogin(Admin u)
{
Admin ad= adr.findById(1).get();
if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
{
return "Welcome admin";
}
else
{
return "invalid Credentials";
}
}
public String adminupdate(Admin a)
{
Admin ad= adr.findById(1).get();
ad.setUsername(a.getUsername());
ad.setPassword(a.getUsername());
adr.saveAndFlush(ad);
return "Updated";
}
public String addQuestion(Question q)
{
if(q!=null)
{
qr.save(q);
return "question added";
}
else
{
return "failed to add";
}
}
public String addQuiz(Quiz q)
{
if(q!=null)
{
qur.save(q);
return "quiz added";
}
else
{
return "failed to add";
}
}
public List<Quiz> viewAllQuiz()
{
return qur.findAll();
}
public Statistics quizInfo()
{
stat.setUsers(ur.findAll().size());
stat.setQuestions(qr.findAll().size());
stat.setQuiz(qur.listOfQuiz());
return stat;
}
}