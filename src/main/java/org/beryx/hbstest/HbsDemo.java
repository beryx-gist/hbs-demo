/*
 * Copyright 2018 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.beryx.hbstest;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import org.beryx.hbs.Helpers;

import java.awt.*;

public class HbsDemo {
	public static void main(String[] args) throws Exception {
        Handlebars handlebars = new Handlebars().with(new ClassPathTemplateLoader());
        Helpers.register(handlebars);
		Template tmpl = handlebars.compile("area");
        String result = tmpl.apply(new Dimension(3, 5));
        System.out.println(result);
    }
}
