/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-01-05 17:25:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>Shopping Mall</title>\r\n");
      out.write("<meta name=\"description\" content=\"Emind-Professional integrated online shopping mall, online sales of household electrical appliances, digital communications, computers, home furnishing, clothing, maternal and child products, books, food, online travel and other Tens of thousands of brands and tens of thousands of quality products. Convenient and honest service, to provide you with a pleasant online shopping experience!\">\r\n");
      out.write("<meta name=\"Keywords\" content=\"Online shopping, Mobile Phone, Laptop, Computer, MP3, CD, VCD, DV, Digital Camera, Digital Accessories, Watches, Memory Card, TaoTao Store\">\r\n");
      out.write("<link href=\"/css/taotao.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.pageConfig={\r\n");
      out.write("\tcompatible:true,\r\n");
      out.write("\tnavId:\"home\",\r\n");
      out.write("\tenableArea: true\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#categorys-2013 .mc {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("#categorys-2013 .mt {\r\n");
      out.write("\tbackground: 0\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header start -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/header.jsp", out, false);
      out.write("<!-- header end -->\r\n");
      out.write("<div class=\"w\">\r\n");
      out.write("<div id=\"o-slide\">\r\n");
      out.write("<div class=\"slide\" id=\"slide\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(";(function(cfg, doc) {\r\n");
      out.write("    if ( !cfg.DATA_MSlide ) {\r\n");
      out.write("        cfg.DATA_MSlide=[];\r\n");
      out.write("    }\r\n");
      out.write("    //var data = [{\"srcB\":\"http://image.taotao.com/images/2015/03/03/2015030304360302109345.jpg\",\"height\":240,\"alt\":\"\",\"width\":670,\"src\":\"http://image.taotao.com/images/2015/03/03/2015030304360302109345.jpg\",\"widthB\":550,\"href\":\"http://sale.jd.com/act/e0FMkuDhJz35CNt.html?cpdad=1DLSUE\",\"heightB\":240},{\"srcB\":\"http://image.taotao.com/images/2015/03/03/2015030304353109508500.jpg\",\"height\":240,\"alt\":\"\",\"width\":670,\"src\":\"http://image.taotao.com/images/2015/03/03/2015030304353109508500.jpg\",\"widthB\":550,\"href\":\"http://sale.jd.com/act/UMJaAPD2VIXkZn.html?cpdad=1DLSUE\",\"heightB\":240},{\"srcB\":\"http://image.taotao.com/images/2015/03/03/2015030304345761102862.jpg\",\"height\":240,\"alt\":\"\",\"width\":670,\"src\":\"http://image.taotao.com/images/2015/03/03/2015030304345761102862.jpg\",\"widthB\":550,\"href\":\"http://sale.jd.com/act/UMJaAPD2VIXkZn.html?cpdad=1DLSUE\",\"heightB\":240},{\"srcB\":\"http://image.taotao.com/images/2015/03/03/201503030434200950530.jpg\",\"height\":240,\"alt\":\"\",\"width\":670,\"src\":\"http://image.taotao.com/images/2015/03/03/201503030434200950530.jpg\",\"widthB\":550,\"href\":\"http://sale.jd.com/act/kj2pmwMuYCrGsK3g.html?cpdad=1DLSUE\",\"heightB\":240},{\"srcB\":\"http://image.taotao.com/images/2015/03/03/2015030304333327002286.jpg\",\"height\":240,\"alt\":\"\",\"width\":670,\"src\":\"http://image.taotao.com/images/2015/03/03/2015030304333327002286.jpg\",\"widthB\":550,\"href\":\"http://sale.jd.com/act/xcDvNbzAqK0CoG7I.html?cpdad=1DLSUE\",\"heightB\":240},{\"srcB\":\"http://image.taotao.com/images/2015/03/03/2015030304324649807137.jpg\",\"height\":240,\"alt\":\"\",\"width\":670,\"src\":\"http://image.taotao.com/images/2015/03/03/2015030304324649807137.jpg\",\"widthB\":550,\"href\":\"http://sale.jd.com/act/eDpBF1s8KcTOYM.html?cpdad=1DLSUE\",\"heightB\":240}];\r\n");
      out.write("\tvar data = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("    cfg.DATA_MSlide = data;\r\n");
      out.write("    // 初始化一个广告信息\r\n");
      out.write("    if ( cfg.DATA_MSlide.length > 1 ) {\r\n");
      out.write("    \tvar first = pageConfig.FN_GetCompatibleData( cfg.DATA_MSlide[0] );\r\n");
      out.write("        var TPL = ''\r\n");
      out.write("            +'<ul class=\"slide-items\">'\r\n");
      out.write("            +'<li clstag=\"homepage|keycount|home2013|09a1\">'\r\n");
      out.write("            +'<a href=\"'+ first.href +'\" target=\"_blank\" title=\"'+ first.alt +'\">'\r\n");
      out.write("            +'<img src=\"'+ first.src +'\" width=\"'+ first.width +'\" height=\"'+ first.height +'\" >'\r\n");
      out.write("            +'</a>'\r\n");
      out.write("            +'</li>'\r\n");
      out.write("            +'</ul><div class=\"slide-controls\"><span class=\"curr\">1</span></div>';\r\n");
      out.write("        doc.write(TPL);\r\n");
      out.write("    }\r\n");
      out.write("})(pageConfig, document);;</script>\r\n");
      out.write("</div><!--slide end-->\r\n");
      out.write("<div class=\"jscroll\" id=\"mscroll\">\r\n");
      out.write("<div class=\"ctrl\" id=\"mscroll-ctrl-prev\"><b></b></div>\r\n");
      out.write("<div class=\"ctrl\" id=\"mscroll-ctrl-next\"><b></b></div>\r\n");
      out.write("<div class=\"o-list\">\r\n");
      out.write("<div class=\"list\" id=\"mscroll-list\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div><!--mscroll end-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("(function(object, data) {\r\n");
      out.write("    var a = data, b = [], c = [], d, h;\r\n");
      out.write("    a.sort(function(a, b) {\r\n");
      out.write("        return a.ext - b.ext\r\n");
      out.write("    });\r\n");
      out.write("    while (a.length > 0) {\r\n");
      out.write("        d = a.shift();\r\n");
      out.write("        if (d.ext) {\r\n");
      out.write("            b.push(d)\r\n");
      out.write("        } else {\r\n");
      out.write("            c.push(d)\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    c.sort(function() {\r\n");
      out.write("        return 0.5 - Math.random()\r\n");
      out.write("    });\r\n");
      out.write("    h = b.length;\r\n");
      out.write("    if (h >= 3) {\r\n");
      out.write("        for (var i = 0; i < 3; i++) {\r\n");
      out.write("            a.push(b.shift())\r\n");
      out.write("        }\r\n");
      out.write("    } else {\r\n");
      out.write("        for (var i = 0; i < h; i++) {\r\n");
      out.write("            a.push(b.shift())\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    var f = a.length, g = c.length;\r\n");
      out.write("    for (var i = 0; i < 18 - f; i++) {\r\n");
      out.write("        if (i > g - 1) {\r\n");
      out.write("            continue;\r\n");
      out.write("        }\r\n");
      out.write("        a.push(c.shift())\r\n");
      out.write("    }\r\n");
      out.write("    var e = [], x;\r\n");
      out.write("    e.push(\"<ul class=\\\"lh\\\">\");\r\n");
      out.write("    for (var i = 0; i < 3; i++) {\r\n");
      out.write("        x = pageConfig.FN_GetCompatibleData(a[i]);\r\n");
      out.write("        e.push(\"<li class=\\\"item\\\"><a href=\\\"\");\r\n");
      out.write("        e.push(x.href);\r\n");
      out.write("        e.push(\"\\\"><img src=\\\"/images/blank.gif\\\" style=\\\"background:url(\");\r\n");
      out.write("        e.push(x.src);\r\n");
      out.write("        e.push(\") no-repeat #fff center 0;\\\" alt=\\\"\");\r\n");
      out.write("        e.push(x.alt);\r\n");
      out.write("        e.push(\"\\\" width=\\\"\");\r\n");
      out.write("        e.push(x.width);\r\n");
      out.write("        e.push(\"\\\" height=\\\"\");\r\n");
      out.write("        e.push(x.height);\r\n");
      out.write("        e.push(\"\\\" /></a></li>\")\r\n");
      out.write("    }\r\n");
      out.write("    e.push(\"</ul>\");\r\n");
      out.write("    document.getElementById(object).innerHTML = e.join(\"\");\r\n");
      out.write("    pageConfig.DATA_MScroll = a\r\n");
      out.write("})(\"mscroll-list\", pageConfig.DATA_MScroll);\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"m fr da0x70\" clstag=\"homepage|keycount|home2013|10a\">\r\n");
      out.write("<script>\r\n");
      out.write("// 右上方广告位\r\n");
      out.write("(function() {\r\n");
      out.write("\tvar data = [\r\n");
      out.write("\t            {\r\n");
      out.write("\t                \"width\": 310,\r\n");
      out.write("\t                \"height\": 70,\r\n");
      out.write("\t                \"src\": \"/images/abba.jpg\",\r\n");
      out.write("\t                \"href\": \"\",\r\n");
      out.write("\t                \"alt\": \"\",\r\n");
      out.write("\t                \"widthB\": 210,\r\n");
      out.write("\t                \"heightB\": 70,\r\n");
      out.write("\t                \"srcB\": \"http://img14.360buyimg.com/da/jfs/t334/155/1756719493/14371/e367c503/5440ce6dNd056ce39.jpg\"\r\n");
      out.write("\t            }\r\n");
      out.write("\t        ];\r\n");
      out.write("    var ad = pageConfig.FN_GetRandomData(data);\r\n");
      out.write("    ad = pageConfig.FN_GetCompatibleData(ad);\r\n");
      out.write("    document.write(\"<a href=\\\"\" + ad.href + \"\\\" target=\\\"_blank\\\"><img data-img=\\\"2\\\" src=\\\"\" + ad.src + \"\\\" width=\\\"\" + ad.width + \"\\\" height=\\\"\" + ad.height + \"\\\" alt=\\\"\" + ad.alt + \"\\\" /></a>\");\r\n");
      out.write("})();\r\n");
      out.write("</script>\r\n");
      out.write("</div><!--da end-->\r\n");
      out.write("<div id=\"jdnews\" class=\"m m1\" >\r\n");
      out.write("<div class=\"mt\">\r\n");
      out.write("<h2>ParkenShop News</h2>\r\n");
      out.write("<div class=\"extra\" clstag=\"homepage|keycount|home2013|11a\"><a href=\"http://www.jd.com/moreSubject.aspx\" target=\"_blank\">More News&nbsp;&gt;</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mc\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li class=\"odd\" clstag=\"homepage|keycount|home2013|11b1\"><a href=\"\" target=\"_blank\" title=\"38 women's day to get 3800 yuan financial management\">38 women's day to get 3800 yuan financial management</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<li clstag=\"homepage|keycount|home2013|11b1\"><a href=\"http://sale.jd.com/act/U0jwsxIFrmO.html\" target=\"_blank\" title=\"School season audio and video full 299 minus 99\">School season audio and video full 299 minus 99</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"odd\" clstag=\"homepage|keycount|home2013|11b1\"><a href=\"http://sale.jd.com/act/Kz4QnjJMuL.html\" target=\"_blank\" title=\"Love wedding in diamond\">Love wedding in diamond</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<li clstag=\"homepage|keycount|home2013|11b1\"><a href=\"http://sale.jd.com/act/Z5o4RNyF2Uv.html\" target=\"_blank\" title=\"Popular style makes you beautiful\">Popular style makes you beautiful</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--新闻结束-->\r\n");
      out.write(" \r\n");
      out.write("<div data-widget=\"tabs\" class=\"m _520_a_lifeandjourney_1\" id=\"virtuals-2014\">\r\n");
      out.write("<div class=\"mt\">\r\n");
      out.write("\r\n");
      out.write("<a href=\"\"> <img src=\"http://192.168.2.130/images/2016/12/18/1481992201885026.jpg\"  width=\"309px\" height=\"190px\"/> </a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mc\">\r\n");
      out.write("<a href=\"#none\" class=\"close\">×</a>\r\n");
      out.write("<div class=\"virtuals-iframes hide\">\r\n");
      out.write("<iframe width=\"100%\" scrolling=\"no\" height=\"139px\" frameborder=\"0\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"virtuals-iframes hide\">\r\n");
      out.write("<iframe width=\"100%\" scrolling=\"no\" height=\"139px\" frameborder=\"0\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"virtuals-iframes hide\">\r\n");
      out.write("<iframe width=\"100%\" scrolling=\"no\" height=\"139px\" frameborder=\"0\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"virtuals-iframes hide\">\r\n");
      out.write("<iframe width=\"100%\" scrolling=\"no\" height=\"139px\" frameborder=\"0\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--virtuals end-->\r\n");
      out.write("<span class=\"clr\"></span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/footer.jsp", out, false);
      out.write("<!-- footer end -->\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/home.js\" charset=\"utf-8\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}