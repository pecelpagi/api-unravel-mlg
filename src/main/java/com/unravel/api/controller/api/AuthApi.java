package com.unravel.api.controller.api;

import com.unravel.api.entity.BusinessUser;
import com.unravel.api.model.WebResponse;
import com.unravel.api.model.auth.BusinessUserResponse;
import com.unravel.api.model.auth.LoginRequest;
import com.unravel.api.util.ApiStaticData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthApi {

    @PostMapping(
            path = ApiStaticData.API_BUSINESS_USER_PREFIX + "/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    WebResponse<String> loginBusinessUser(@RequestBody LoginRequest loginRequest);

    @GetMapping(
            path = ApiStaticData.API_BUSINESS_USER_PREFIX + "/auth/me",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    WebResponse<BusinessUserResponse> getBusinessUserProfile(BusinessUser businessUser);

}
