
package introsde;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Business", targetNamespace = "http://soap.sde.isde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Business {


    /**
     * 
     * @param userIn
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://soap.sde.isde/", className = "introsde.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.UpdateUserResponse")
    @Action(input = "http://soap.sde.isde/Business/updateUserRequest", output = "http://soap.sde.isde/Business/updateUserResponse")
    public User updateUser(
        @WebParam(name = "userIn", targetNamespace = "")
        User userIn);

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "toDoGoal", targetNamespace = "http://soap.sde.isde/", className = "introsde.ToDoGoal")
    @ResponseWrapper(localName = "toDoGoalResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.ToDoGoalResponse")
    @Action(input = "http://soap.sde.isde/Business/toDoGoalRequest", output = "http://soap.sde.isde/Business/toDoGoalResponse")
    public List<Goal> toDoGoal(
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param password
     * @param userName
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://soap.sde.isde/", className = "introsde.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.LoginResponse")
    @Action(input = "http://soap.sde.isde/Business/loginRequest", output = "http://soap.sde.isde/Business/loginResponse")
    public User login(
        @WebParam(name = "userName", targetNamespace = "")
        String userName,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param userIn
     * @return
     *     returns introsde.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://soap.sde.isde/", className = "introsde.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.CreateUserResponse")
    @Action(input = "http://soap.sde.isde/Business/createUserRequest", output = "http://soap.sde.isde/Business/createUserResponse")
    public User createUser(
        @WebParam(name = "userIn", targetNamespace = "")
        User userIn);

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.HealthMeasure>
     */
    @WebMethod
    @WebResult(name = "healthMeasures", targetNamespace = "")
    @RequestWrapper(localName = "getRecentHealthMeasureByUser", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetRecentHealthMeasureByUser")
    @ResponseWrapper(localName = "getRecentHealthMeasureByUserResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetRecentHealthMeasureByUserResponse")
    @Action(input = "http://soap.sde.isde/Business/getRecentHealthMeasureByUserRequest", output = "http://soap.sde.isde/Business/getRecentHealthMeasureByUserResponse")
    public List<HealthMeasure> getRecentHealthMeasureByUser(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser);

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "failGoal", targetNamespace = "http://soap.sde.isde/", className = "introsde.FailGoal")
    @ResponseWrapper(localName = "failGoalResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.FailGoalResponse")
    @Action(input = "http://soap.sde.isde/Business/failGoalRequest", output = "http://soap.sde.isde/Business/failGoalResponse")
    public List<Goal> failGoal(
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.HealthMeasure>
     */
    @WebMethod
    @WebResult(name = "healthMeasures", targetNamespace = "")
    @RequestWrapper(localName = "getHistoryOfAllHealthMeasureByUser", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetHistoryOfAllHealthMeasureByUser")
    @ResponseWrapper(localName = "getHistoryOfAllHealthMeasureByUserResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetHistoryOfAllHealthMeasureByUserResponse")
    @Action(input = "http://soap.sde.isde/Business/getHistoryOfAllHealthMeasureByUserRequest", output = "http://soap.sde.isde/Business/getHistoryOfAllHealthMeasureByUserResponse")
    public List<HealthMeasure> getHistoryOfAllHealthMeasureByUser(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser);

    /**
     * 
     * @param idUser
     * @param healthMeasureIn
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addHealthMeasure", targetNamespace = "http://soap.sde.isde/", className = "introsde.AddHealthMeasure")
    @ResponseWrapper(localName = "addHealthMeasureResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.AddHealthMeasureResponse")
    @Action(input = "http://soap.sde.isde/Business/addHealthMeasureRequest", output = "http://soap.sde.isde/Business/addHealthMeasureResponse")
    public String addHealthMeasure(
        @WebParam(name = "idUser", targetNamespace = "")
        Long idUser,
        @WebParam(name = "healthMeasureIn", targetNamespace = "")
        HealthMeasure healthMeasureIn);

    /**
     * 
     * @param calories
     * @param type
     * @return
     *     returns java.util.List<introsde.Food>
     */
    @WebMethod
    @WebResult(name = "foods", targetNamespace = "")
    @RequestWrapper(localName = "suggestFoodByCaloriesBound", targetNamespace = "http://soap.sde.isde/", className = "introsde.SuggestFoodByCaloriesBound")
    @ResponseWrapper(localName = "suggestFoodByCaloriesBoundResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.SuggestFoodByCaloriesBoundResponse")
    @Action(input = "http://soap.sde.isde/Business/suggestFoodByCaloriesBoundRequest", output = "http://soap.sde.isde/Business/suggestFoodByCaloriesBoundResponse")
    public List<Food> suggestFoodByCaloriesBound(
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "calories", targetNamespace = "")
        double calories);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<introsde.Food>
     */
    @WebMethod
    @WebResult(name = "foods", targetNamespace = "")
    @RequestWrapper(localName = "suggestFoodByType", targetNamespace = "http://soap.sde.isde/", className = "introsde.SuggestFoodByType")
    @ResponseWrapper(localName = "suggestFoodByTypeResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.SuggestFoodByTypeResponse")
    @Action(input = "http://soap.sde.isde/Business/suggestFoodByTypeRequest", output = "http://soap.sde.isde/Business/suggestFoodByTypeResponse")
    public List<Food> suggestFoodByType(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param idUser
     * @param healthMeasure
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "controlGoalHealth", targetNamespace = "http://soap.sde.isde/", className = "introsde.ControlGoalHealth")
    @ResponseWrapper(localName = "controlGoalHealthResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.ControlGoalHealthResponse")
    @Action(input = "http://soap.sde.isde/Business/controlGoalHealthRequest", output = "http://soap.sde.isde/Business/controlGoalHealthResponse")
    public List<Goal> controlGoalHealth(
        @WebParam(name = "healthMeasure", targetNamespace = "")
        HealthMeasure healthMeasure,
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param idUser
     * @param activity
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "controlGoalActivity", targetNamespace = "http://soap.sde.isde/", className = "introsde.ControlGoalActivity")
    @ResponseWrapper(localName = "controlGoalActivityResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.ControlGoalActivityResponse")
    @Action(input = "http://soap.sde.isde/Business/controlGoalActivityRequest", output = "http://soap.sde.isde/Business/controlGoalActivityResponse")
    public List<Goal> controlGoalActivity(
        @WebParam(name = "activity", targetNamespace = "")
        Activity activity,
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "getGoalAchieved", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetGoalAchieved")
    @ResponseWrapper(localName = "getGoalAchievedResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetGoalAchievedResponse")
    @Action(input = "http://soap.sde.isde/Business/getGoalAchievedRequest", output = "http://soap.sde.isde/Business/getGoalAchievedResponse")
    public List<Goal> getGoalAchieved(
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param idUser
     * @param goalIn
     * @return
     *     returns introsde.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "followGoal", targetNamespace = "http://soap.sde.isde/", className = "introsde.FollowGoal")
    @ResponseWrapper(localName = "followGoalResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.FollowGoalResponse")
    @Action(input = "http://soap.sde.isde/Business/followGoalRequest", output = "http://soap.sde.isde/Business/followGoalResponse")
    public Goal followGoal(
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser,
        @WebParam(name = "goalIn", targetNamespace = "")
        Goal goalIn);

    /**
     * 
     * @param idUser
     * @return
     *     returns java.util.List<introsde.Activity>
     */
    @WebMethod
    @WebResult(name = "activities", targetNamespace = "")
    @RequestWrapper(localName = "getMyDoneActivity", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetMyDoneActivity")
    @ResponseWrapper(localName = "getMyDoneActivityResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetMyDoneActivityResponse")
    @Action(input = "http://soap.sde.isde/Business/getMyDoneActivityRequest", output = "http://soap.sde.isde/Business/getMyDoneActivityResponse")
    public List<Activity> getMyDoneActivity(
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param idUser
     * @param activityIn
     * @return
     *     returns introsde.Activity
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "addMyActivity", targetNamespace = "http://soap.sde.isde/", className = "introsde.AddMyActivity")
    @ResponseWrapper(localName = "addMyActivityResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.AddMyActivityResponse")
    @Action(input = "http://soap.sde.isde/Business/addMyActivityRequest", output = "http://soap.sde.isde/Business/addMyActivityResponse")
    public Activity addMyActivity(
        @WebParam(name = "activityIn", targetNamespace = "")
        Activity activityIn,
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @param idUser
     * @param healthMeasureType
     * @return
     *     returns introsde.Activity
     */
    @WebMethod
    @WebResult(name = "activity", targetNamespace = "")
    @RequestWrapper(localName = "getRelatedActivityToHealthType", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetRelatedActivityToHealthType")
    @ResponseWrapper(localName = "getRelatedActivityToHealthTypeResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetRelatedActivityToHealthTypeResponse")
    @Action(input = "http://soap.sde.isde/Business/getRelatedActivityToHealthTypeRequest", output = "http://soap.sde.isde/Business/getRelatedActivityToHealthTypeResponse")
    public Activity getRelatedActivityToHealthType(
        @WebParam(name = "healthMeasureType", targetNamespace = "")
        String healthMeasureType,
        @WebParam(name = "idUser", targetNamespace = "")
        long idUser);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuote", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetQuote")
    @ResponseWrapper(localName = "getQuoteResponse", targetNamespace = "http://soap.sde.isde/", className = "introsde.GetQuoteResponse")
    @Action(input = "http://soap.sde.isde/Business/getQuoteRequest", output = "http://soap.sde.isde/Business/getQuoteResponse")
    public String getQuote();

}
