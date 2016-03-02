package com.sai.training.springprimer.services.calculator;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by saipkri on 02/03/16.
 */
@Service
public class CalculatorService {

    /**
     * Evaluates an expression and returns a result.
     *
     * @param expression
     * @return
     */
    public Object evaluate(final String expression) {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            return engine.eval(expression);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }
}
