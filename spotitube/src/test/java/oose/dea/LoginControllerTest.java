package oose.dea;

import dea.controllers.dto.LoginRequestDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.ws.rs.core.Response;

public class LoginControllerTest {

    @BeforeEach
    void setup(){

    }

    @Test
    void doesEndpointDelegateCorrectWorkToDAO(){
        //Setup
        var dto = new LoginRequestDto();
        dto.setUser("meron");
        dto.setPassword("MySuperSecretPassword1234");

       // Mockito.when(loginDaoMock.login("meron", "MySuperSecretPassword1234")).thenReturn(userModel);

        //Test
       // Response response = loginController.login(dto);
        //Verify
       // Mockito.verify(loginDaoMock).login("meron", "MySuperSecretPassword1234");
    }
}
