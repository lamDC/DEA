package dataresources;

import dea.controllers.dto.LoginRequestDto;

public class LoginDAO {

    private LoginRequestDto request;

    public String performLogin(LoginRequestDto request) {
        this.request = request;

        if ("meron".equals(request.getUser()) && "1234".equals(request.getPassword())) {
            return "dgsfghbgfs3r34yr";
        } else {
            return "error";
        }
    }
}
