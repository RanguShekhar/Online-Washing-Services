package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fabrinz_005fcustm_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html class=\"no-js\" lang=\"en\"><!--<![endif]-->\n");
      out.write("<!-- the \"no-js\" class is for Modernizr. --> \n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame -->\n");
      out.write("\t\n");
      out.write("\t<!-- Important stuff for SEO, don't neglect. (And don't dupicate values across your site!) -->\n");
      out.write("\t<title>Fabrinz- Login</title>\n");
      out.write("\t<meta name=\"author\" content=\"\" />\n");
      out.write("\t <meta name=\"description\" content=\"fabrinz- On-Demand Laundry & Dry Cleaning Services.\"/>\n");
      out.write("        <meta name=\"keywords\" content=\"laundry, dry cleaning, washing, ironing, laundry mobile app, laundry india, fabrinz, doorstep laundry, online laundry\" />\n");
      out.write("        \n");
      out.write("\t<!-- Don't forget to set your site up: http://google.com/webmasters -->\n");
      out.write("\t<meta name=\"google-site-verification\" content=\"\" /> \n");
      out.write("\t<!-- Who owns the content of this site? -->\n");
      out.write("\t<!--  Mobile Viewport\n");
      out.write("\thttp://j.mp/mobileviewport & http://davidbcalhoun.com/2010/viewport-metatag\n");
      out.write("\tdevice-width : Occupy full width of the screen in its current orientation\n");
      out.write("\tinitial-scale = 1.0 retains dimensions instead of zooming out if page height > device height\n");
      out.write("\tmaximum-scale = 1.0 retains dimensions instead of zooming in if page width < device width (wrong for most sites)\n");
      out.write("\t-->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\" />\n");
      out.write("\t <script>\n");
      out.write("\n");
      out.write("            window.fbAsyncInit = function() {\n");
      out.write("                FB.init({\n");
      out.write("                    appId:'905243722836879',//\n");
      out.write("                    cookie: true, // enable cookies to allow the server to access the session\n");
      out.write("                    xfbml: true, // parse social plugins on this page\n");
      out.write("                    version: 'v2.1' // use version 2.1\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("                FB.getLoginStatus(function(response) {\n");
      out.write("                //    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            // Load the SDK asynchronously\n");
      out.write("            (function(d, s, id) {\n");
      out.write("                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                if (d.getElementById(id))\n");
      out.write("                    return;\n");
      out.write("                js = d.createElement(s);\n");
      out.write("                js.id = id;\n");
      out.write("                js.src = \"//connect.facebook.net/en_US/sdk.js\";\n");
      out.write("                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            // This is called with the results from from FB.getLoginStatus().\n");
      out.write("            function statusChangeCallback(response) {\n");
      out.write("                console.log('statusChangeCallback');\n");
      out.write("                console.log(response);\n");
      out.write("                if (response.status === 'connected') {\n");
      out.write("                    console.log('Welcome!  Fetching your information.... ');\n");
      out.write("                    FB.api('/me', function(response) {\n");
      out.write("                        //alert(JSON.stringify(response));\n");
      out.write("                        $(\"#firstname\").val(response.first_name);\n");
      out.write("                        $(\"#lastname\").val(response.last_name);\n");
      out.write("                        $(\"#email\").val(response.email);\n");
      out.write("                       // $(\"fabrinz_login\").submit();\n");
      out.write("                       $(\"#t\").val(\"facebook\");\n");
      out.write("                       document.getElementById(\"fabrinz_login\").submit();\n");
      out.write("                        // form.submit();\n");
      out.write("                      \n");
      out.write("                      //  $(\"#loginmsg\").html(\"welcome \" + response.name+\"(<a href='javascript:fbLogoutUser()'>Logout</a>)\");\n");
      out.write("                    });\n");
      out.write("                } else if (response.status === 'not_authorized') {\n");
      out.write("                    //document.getElementById('status').innerHTML = 'Please log ' +   'into this app.';\n");
      out.write("                } else {\n");
      out.write("                    //document.getElementById('status').innerHTML = 'Please log ' +   'into Facebook.';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function checkFacebookLoginState() {\n");
      out.write("                FB.login(function(response) {\n");
      out.write("                    FB.getLoginStatus(function(response) {\n");
      out.write("                        statusChangeCallback(response);\n");
      out.write("                    });\n");
      out.write("                }, {scope: 'public_profile,email'});\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function fbLogoutUser() {\n");
      out.write("                FB.getLoginStatus(function(response) {\n");
      out.write("                    if (response && response.status === 'connected') {\n");
      out.write("                        FB.logout(function(response) {\n");
      out.write("                            $(\"#firstname\").val(\"\");\n");
      out.write("                            $(\"#lastname\").val(\"\");\n");
      out.write("                            $(\"#email\").val(\"\");\n");
      out.write("                            $(\"#t\").val(\"Direct\");\n");
      out.write("                           \n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("          \n");
      out.write("    var gpclass = (function(){\n");
      out.write("    \n");
      out.write("    //Defining Class Variables here\n");
      out.write("    var response = undefined;\n");
      out.write("    return {\n");
      out.write("        //Class functions / Objects\n");
      out.write("        \n");
      out.write("        mycoddeSignIn:function(response){\n");
      out.write("            // The user is signed in\n");
      out.write("            if (response['access_token']) {\n");
      out.write("           \n");
      out.write("                //Get User Info from Google Plus API\n");
      out.write("                gapi.client.load('plus','v1',this.getUserInformation);\n");
      out.write("                \n");
      out.write("            } else if (response['error']) {\n");
      out.write("                // There was an error, which means the user is not signed in.\n");
      out.write("                //alert('There was an error: ' + authResult['error']);\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        \n");
      out.write("        getUserInformation: function(){\n");
      out.write("            var request = gapi.client.plus.people.get( {'userId' : 'me'} );\n");
      out.write("            \n");
      out.write("            request.execute( function(profile) {\n");
      out.write("                var email = profile['emails'].filter(function(v) {\n");
      out.write("                    return v.type === 'account'; // Filter out the primary email\n");
      out.write("                })[0].value;\n");
      out.write("              \n");
      out.write("                var fName = profile.displayName;\n");
      out.write("              //  $(\"#inputFullname\").val(fName);\n");
      out.write("             //   $(\"#inputEmail\").val(email);\n");
      out.write("                  $(\"#firstname\").val(fName);\n");
      out.write("                   //     $(\"#lastname\").val(response.last_name);\n");
      out.write("                        $(\"#email\").val(email);\n");
      out.write("                       // $(\"fabrinz_login\").submit();\n");
      out.write("                       $(\"#t\").val(\"googleplus\");\n");
      out.write("                       document.getElementById(\"fabrinz_login\").submit();\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("    }; //End of Return\n");
      out.write("    })();\n");
      out.write("    \n");
      out.write("    function oauth2callback(gpSignInResponse){\n");
      out.write("        \n");
      out.write("        gpclass.mycoddeSignIn(gpSignInResponse);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("      function login()\n");
      out.write("{\n");
      out.write("  var myParams = {\n");
      out.write("    'clientid' : '1095278811225-v0jq95c60m3t2d25ueoem6kdmeldh58a.apps.googleusercontent.com',\n");
      out.write("    'cookiepolicy' : 'single_host_origin',\n");
      out.write("    'callback' : 'oauth2callback',\n");
      out.write("    'theme': 'dark',\n");
      out.write("    'accesstype':'offline',\n");
      out.write("    'scope' : 'https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/userinfo.email'\n");
      out.write("  };\n");
      out.write("  gapi.auth.signIn(myParams);\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("  (function() {\n");
      out.write("    var po = document.createElement('script');\n");
      out.write("    po.type = 'text/javascript'; po.async = true;\n");
      out.write("    po.src = 'https://plus.google.com/js/client:plusone.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0];\n");
      out.write("    s.parentNode.insertBefore(po, s);\n");
      out.write("  })();\n");
      out.write("  </script>\n");
      out.write("  <script>(function() {\n");
      out.write("var _fbq = window._fbq || (window._fbq = []);\n");
      out.write("if (!_fbq.loaded) {\n");
      out.write("var fbds = document.createElement('script');\n");
      out.write("fbds.async = true;\n");
      out.write("fbds.src = '//connect.facebook.net/en_US/fbds.js';\n");
      out.write("var s = document.getElementsByTagName('script')[0];\n");
      out.write("s.parentNode.insertBefore(fbds, s);\n");
      out.write("_fbq.loaded = true;\n");
      out.write("}\n");
      out.write("_fbq.push(['addPixelId', '1619496634975726']);\n");
      out.write("})();\n");
      out.write("window._fbq = window._fbq || [];\n");
      out.write("window._fbq.push(['track', 'PixelInitialized', {}]);\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/login.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("    <br/>\n");
      out.write("\t<div class='loginwrap'>\n");
      out.write("            <a href=\"index.jsp\"><img src='img/logo-signin.png' align='center'/></a><BR><BR>\n");
      out.write("\t\t \n");
      out.write("\t\t<div class='login'>\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!--<div class='loginhead'>\n");
      out.write("\t\t\t\t<h2>Sign in</h2>\n");
      out.write("\t\t\t</div>-->\n");
      out.write("\t\t\t<div class='success'><div id=\"errorMsg\"></div></div>\n");
      out.write("           <div id=\"errorMsg1\" class=\"error\"></div>\n");
      out.write("\t\t\t<div class='loginbody clearfix'>\t\t\t\n");
      out.write("                            <form method='post' action='login_custm.jsp' name=\"fabrinz_login\" id=\"fabrinz_login\">\n");
      out.write("                                    <input type='text' placeholder='Email/Mobile No' name=\"uname\" id=\"uname\" />\n");
      out.write("                                    <input type='password' placeholder='Password' name=\"pwd\" id=\"pwd\" />\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                    <input type='submit' value='Submit' id=\"loginCheck\" />\n");
      out.write("\t\t\t\t\t<div class='clearfix'>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<a href='Sign-up.jsp' class='blk'>Not a Customer?   Sign Up</a>\n");
      out.write("                                        <a href='fabrinz_custm_forgot.jsp' class='blk'>Forgot Password</a>\n");
      out.write("\t\t\t\t\t <!--a href='javascript:checkFacebookLoginState()'><img src='img/fconnect.png' /></a>\n");
      out.write("                                          <a href='javascript:login()'><img src='img/gconnect.png' /></a>\n");
      out.write("                                         <input type=\"hidden\" name=\"firstname\" id=\"firstname\" value=\"\"/>\n");
      out.write("   <input type=\"hidden\" name=\"lastname\" id=\"lastname\" value=\"\"/>\n");
      out.write("   <input type=\"hidden\" name=\"email\" id=\"email\" value=\"\"/>\n");
      out.write("      <input type=\"hidden\" name=\"t\" id=\"t\" value=\"Direct\"/>\n");
      out.write("\t\t\t\t\t</div-->\n");
      out.write("\t\t\t\t\t<!--<div class='fr'>\n");
      out.write("\t\t\t\t\t<a href='' class='blk tr'>Forgot your password</a> \n");
      out.write("\t\t\t\t\t<a href=''><img src='img/twicon.png' /></a>\n");
      out.write("\t\t\t\t\t</div>-->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class='loginfooter clearfix'>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href='index.jsp#services'>Services</a></li>\n");
      out.write("\t\t\t\t\t<li><a href='tos.jsp'>Terms &amp; Conditions</a></li>\n");
      out.write("\t\t\t\t\t<li class='last'><a href='contact.jsp'>Contact</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("$(window).load(function(){\n");
      out.write("\n");
      out.write("    $('.loginwrap').css({\n");
      out.write("        position:'absolute',\n");
      out.write("        left: ($(window).width() - $('.loginwrap').outerWidth())/2,\n");
      out.write("        top: ($(window).height() - $('.loginwrap').outerHeight())/2\n");
      out.write("    });\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("// To initially run the function:\n");
      out.write("$(window).resize();\t\t\n");
      out.write("</script> \n");
      out.write("\t<script>\n");
      out.write("\t\t    (function(i, s, o, g, r, a, m) {\n");
      out.write("\t\t        i['GoogleAnalyticsObject'] = r;\n");
      out.write("\t\t        i[r] = i[r] || function() {\n");
      out.write("\t\t            (i[r].q = i[r].q || []).push(arguments)\n");
      out.write("\t\t        }, i[r].l = 1 * new Date();\n");
      out.write("\t\t        a = s.createElement(o),\n");
      out.write("\t\t                m = s.getElementsByTagName(o)[0];\n");
      out.write("\t\t        a.async = 1;\n");
      out.write("\t\t        a.src = g;\n");
      out.write("\t\t        m.parentNode.insertBefore(a, m)\n");
      out.write("\t\t    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');\n");
      out.write("\n");
      out.write("\t\t    ga('create', 'UA-57639059-1', 'auto');\n");
      out.write("\t\t    ga('send', 'pageview');\n");
      out.write("\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("/* <![CDATA[ */\n");
      out.write("var google_conversion_id = 945558947;\n");
      out.write("var google_custom_params = window.google_tag_params;\n");
      out.write("var google_remarketing_only = true;\n");
      out.write("/* ]]> */\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"//www.googleadservices.com/pagead/conversion.js\">\n");
      out.write("</script>\n");
      out.write("<noscript>\n");
      out.write("<div style=\"display:inline;\">\n");
      out.write("<img height=\"1\" width=\"1\" style=\"border-style:none;\" alt=\"\" \n");
      out.write("\n");
      out.write("src=\"//googleads.g.doubleclick.net/pagead/viewthroughconversion/945558947/?value=0&amp;guid=ON&amp;script=0\"/>\n");
      out.write("</div>\n");
      out.write("</noscript>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
