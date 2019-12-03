<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/25/2019
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 导航侧栏 -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><security:authentication property="principal.username"/></p>
                <a href="#"><i class="fa fa-circle text-success"></i> 不在线</a>
            </div>
        </div>
        <!-- search form -->
        <!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
        <!-- /.search form -->


        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>

            <li id="admin-index"><a href="${pageContext.request.contextPath}/main.jsp"><i class="fa fa-dashboard"></i> <span>首页</span></a>
            </li>

            <!-- 菜单 -->
            <%--系统管理--%>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-folder"></i> <span>系统管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">

                    <li id="admin-login">
                        <a href="${pageContext.request.contextPath}/admin/all">
                            <i class="fa fa-circle-o"></i> 管理员管理
                        </a>
                    </li>

                    <li id="admin-register">
                        <a href="${pageContext.request.contextPath}/role/all">
                            <i class="fa fa-circle-o"></i> 角色管理
                        </a>
                    </li>

                    <li id="admin-404">
                        <a href="${pageContext.request.contextPath}/permission/all">
                            <i class="fa fa-circle-o"></i> 资源权限管理
                        </a>
                    </li>

                    <li id="admin-500">
                        <a href="${pageContext.request.contextPath}/log/all">
                            <i class="fa fa-circle-o"></i> 正常日志
                        </a>
                    </li>
                    <li id="admin-i">
                        <a href="${pageContext.request.contextPath}/errorLog/all">
                            <i class="fa fa-circle-o"></i> 错误日志
                        </a>
                    </li>
                </ul>
            </li>

            <%--基础数据--%>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-pie-chart"></i> <span>基础数据</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li id="cha">
                        <a href="${pageContext.request.contextPath}/user/all">
                            <i class="fa fa-circle-o"></i> 用户管理
                        </a>
                    </li>
                    <li id="charts-morris">
                        <a href="${pageContext.request.contextPath}/order/all">
                            <i class="fa fa-circle-o"></i> 订单管理
                        </a>
                    </li>
                    <li id="charts-chartjs">
                        <a href="${pageContext.request.contextPath}/commodity/all">
                            <i class="fa fa-circle-o"></i> 产品管理
                        </a>
                    </li>

                </ul>
            </li>
            <!-- 菜单 /-->
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
<!-- 导航侧栏 /-->
