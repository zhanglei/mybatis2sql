/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.parent_childs;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

class TestWljs {

    private static SqlSessionFactory sqlSessionFactory;


    public static void main(String args[]) throws Exception {

        try (Reader reader = Resources.getResourceAsReader("org/apache/ibatis/submitted/parent_childs/mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }

     /* BaseDataTest.runScript(sqlSessionFactory.getConfiguration().getEnvironment().getDataSource(),
                "org/apache/ibatis/submitted/complex_column/CreateDB.sql");
      try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = personMapper.getWithoutComplex(2L);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        Person parent = person.getParent();
        System.out.println(parent.getFirstName());
        System.out.println(parent.getLastName());
      }*/

    }


}
