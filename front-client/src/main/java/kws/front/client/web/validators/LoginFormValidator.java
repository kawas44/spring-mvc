package kws.front.client.web.validators;

import kws.front.client.web.forms.LoginForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginFormValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return LoginForm.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "invalid");
    }

}
