/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.93
 * Generated at: 2019-03-04 08:14:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_005femp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
			//定义全局变量， 一定要记录使用特有的格式才能定义全局变量
			public static final String  dirver="com.mysql.jdbc.Driver";   
			public static final String  url = "jdbc:mysql://192.168.122.128:3306/cloudmining";
			public static final String  user = "root";
			public static final String  password= "123";
		
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title> 展示雇员表 </title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h1>雇员表</h1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");

			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		    try{
				Class.forName(dirver);
				conn = DriverManager.getConnection(url,user,password);
				String sql = "select * from emp";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
		
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<table border=\"1\" width=\"80%\" >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>雇员编号</td>\r\n");
      out.write("\t\t\t\t<td>雇员姓名</td>\r\n");
      out.write("\t\t\t\t<td>部门</td>\r\n");
      out.write("\t\t\t\t<td>入职日期</td>\r\n");
      out.write("\t\t\t\t<td>工资</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

			while(rs.next()){
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				java.util.Date date = rs.getDate(4);
				float sal = rs.getFloat(5);
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(empno);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(ename);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(job);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(date);
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(sal);
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t");

			}catch(Exception e){
				System.out.println(e);
			}finally{
				rs.close();
				pstmt.close();
				conn.close();
			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
