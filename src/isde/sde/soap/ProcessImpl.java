package isde.sde.soap;

import introsde.*;


import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;



import org.glassfish.jersey.client.ClientConfig;

import org.xml.sax.SAXException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.json.*;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebService;

//Service Implementation

@WebService(endpointInterface = "isde.sde.soap.Process", serviceName="ProcessService")
public class ProcessImpl implements Process {
  
    ////////////////////////////////BUSINESS METHODsS///////////////////////////////////
    
    ///////////////////////////////////////////USER////////////////////////////////
    

    @Override
    public User login(String userName,String password ){//ok
      
        
        Business business=getBusiness();
        return business.login(userName,password);

    }
    

    
    
    @Override
    public User createUser(User user){ //ok
        
        
        
        Business business=getBusiness();
        return business.createUser(user);
        
        
    }
    
    
    @Override
    public User updateUser(User user){
        
        Business business=getBusiness();
        return business.updateUser(user);
    }
    
    //////////////////////////////////HEALTHMEASURE/////////////////////////////////

    
    @Override
    public List<HealthMeasure> getRecentHealthMeasureByUser(Long idUser){//OK\\
        
        
        Business business=getBusiness();
        
        return business.getRecentHealthMeasureByUser(idUser);
    }
    
    @Override
    public List<HealthMeasure> getHistoryOfAllHealthMeasureByUser(Long idUser ){//OK\\
        
        Business business=getBusiness();
        return business.getHistoryOfAllHealthMeasureByUser(idUser);
    }
    

    @Override
    public String addHealthMeasure( Long idUser, HealthMeasure healthMeasure ){//OK\\ occhio timestamp di health measure e posso rimuovere il iduser qua
        //magari per distance la metto incrementale?
        String result=null;
        String temp=null;
        
        Business business=getBusiness();
        
        /*temp=business.addHealthMeasure(idUser,healthMeasure);
        System.out.println("aggiunta misura");*///order inversion try it XD
        List<Goal> goalList=business.controlGoalHealth(healthMeasure, idUser);
        System.out.println("controllo i goal");
        System.out.println("goalList.size: "+goalList.size());
        
        temp=business.addHealthMeasure(idUser,healthMeasure);
        System.out.println("aggiunta misura");
        
        if((goalList.size()>0) && (goalList.get(0).getEndValue()==goalList.get(0).getProgress())){
            
            result="well done you get your goal: "+ goalList.get(0).getDescription() + ", and for this measure: "+ temp;
        }
        else{
            
            result=temp;
        }

        
        return result;
    }
    
    /////////////////////////////////////FOOD//////////////////////////////////////////
    
    
    
    @Override
    public List<Food> suggestFoodByCaloriesBound(String type, double calories){//OK\\
        
        Business business=getBusiness();
        return business.suggestFoodByCaloriesBound(type,calories);
    }
    
    
    
    @Override
    public List<Food> suggestFoodByType(String type){//OK\\
        
        Business business=getBusiness();
        return business.suggestFoodByType(type);
    }
    ///////////////////////////////////GOAL//////////////////////////////////////////

/*
    
    @Override
    public List<Goal> controlGoalHealth( HealthMeasure healthMeasure, long idUser ){
        
        
        Business business=getBusiness();
        return business.controlGoalHealth(healthMeasure, idUser);
    }
    
    @Override
    public List<Goal> controlGoalActivity( Activity activity, long idUser ){ //fix roba delle date 
        
        
        Business business=getBusiness();
        return business.controlGoalActivity(activity,idUser);
    }
    */
    

    
    
    
    @Override
    public List<Goal> toDoGoal( long idUser){//OK\\

    
        Business business=getBusiness();
        return business.toDoGoal(idUser);
    }
    
	public List<Goal> getGoalAchieved(long idUser){

		
        Business business=getBusiness();
        return business.getGoalAchieved(idUser);

	}


    
    //ogni volta che entra nella app

    @Override
    public List<Goal> failGoal( long idUser){//OK\\


        Business business=getBusiness();
        return business.failGoal(idUser);
    }
    
    

    @Override
    public Goal followGoal(long idUser, Goal goal){// campi necessari di goal  description, value 

        
        Business business=getBusiness();
        return business.followGoal(idUser,goal);
    }

    
    
    
    ///////////////////////////////////ACTIVITY//////////////////////////////////////////
    
    //inserire nel DB query
    @Override
    public List<Activity> getMyDoneActivity(long idUser ){
       
        
        Business business=getBusiness();
        return business.getMyDoneActivity(idUser);
    }
    
    
    @Override
    public String addMyActivity( Activity activity, long idUser ){
       
        String result=null;
        Business business=getBusiness();
        
        Activity activityRetrieved=business.addMyActivity(activity,idUser);
        System.out.println("flag");
        List <Goal> goalList=business.controlGoalActivity(activity,idUser);
        
       
        if((goalList.size()>0) && (goalList.get(0).getEndValue()==goalList.get(0).getProgress())){
            
            result="well done you get your goal: "+ goalList.get(0).getDescription() + ", and for this activity you consume: "+activityRetrieved.getCalories()+"kcal";
        }
        else{
            
            result="for this activity you consume: "+activityRetrieved.getCalories()+"kcal";
        }
        return result;
        
    }

    
    //getRelatedActivity 
    @Override
    public Activity getRelatedActivityToHealthType( String healthMeasureType, long idUser ){
       
        
        Business business=getBusiness();
        //not implemented to do in business
        
        return null;
    }
    
    
    
    
    ///////////////////////////////////////////QUOTE///////////////////////////////////////////////
    
    @Override
    public String getQuote() { //ok
        
        
        
        Business business=getBusiness();
        String quote=business.getQuote();

        
        return quote;
        
    
    }
    
    
    
    
    
    /////////////handle///////////////////////////////////////
  
    public static Business getBusiness(){
       
        BusinessService service= new BusinessService();
        Business business=service.getBusinessImplPort();
        return business;
    }
   
    
}
