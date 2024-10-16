package vovsike.controllers;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import vovsike.services.CreateUserService;
import vovsike.models.User;
import vovsike.user.UserService;

@ApplicationScoped
@Path("/user")
@Consumes("application/json")
public class UserController {

    @Inject
    UserService userService;

    @Inject
    CreateUserService createUserService;

    @DELETE
    @Path("/{id}")
    public void deleteUsers(@PathParam("id") Long id) {
        userService.deleteUser(id);
    }

    @GET
    @Path("/{id}")
    public User getUser(@PathParam("id") Long id) {
        return userService.getUser(id);
    }

    @POST
    public User createUser(User user) {
        return createUserService.createUser(user);
    }

}
