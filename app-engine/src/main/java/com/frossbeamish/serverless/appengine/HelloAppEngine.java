/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.frossbeamish.serverless.appengine;

import java.io.IOException;
import java.util.Optional;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloAppEngine", value = "/hello")
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    final String target = Optional.ofNullable(request.getParameter("target")).orElse("World");
    response.setContentType("text/plain");
    response.getWriter().println("Hello World - App Engine - Standard");
    response.getWriter().println("Hello " + target + "!");
  }

  public static String getInfo() {
    return "Version: "
        + System.getProperty("java.version")
        + " OS: "
        + System.getProperty("os.name")
        + " User: "
        + System.getProperty("user.name");
  }
}
