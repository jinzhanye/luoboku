<%--
  Created by IntelliJ IDEA.
  User: jinzhany
  Date: 2017/1/10
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/basePath.jsp" %>
<!DOCTYPE html>
<html>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8" />

	<head>
		<title>人员添加</title>
		<%@ include file="../common/common_head.jsp" %>
		<%@ include file="../common/detail_head.jsp" %>
	</head>

	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 myNav">
					<div class="navContent">
						<i class="Hui-iconfont">&#xe62d;</i><span id="title">&nbsp;赛程管理&nbsp;&nbsp;>&nbsp;&nbsp;添加赛事</span>
					</div>
				</div>
			</div>

			<div class="row detailRow">
				<div class="col-xs-8 col-md-6 myColCenterBlock">

					<form class="form-horizontal myForm" role="form" id="gameForm" method="post" enctype="multipart/form-rows">
						<div class="form-group">
							<label for="gameName" class="col-sm-2 control-label"><span class="requiredMsg">*</span>客队</label>
							<div class="col-sm-10">
								<input type="hidden" id="schId" name="schId" value="${gameDetail.schId}" />
								<input type="hidden" id="schLogo" name="schLogo" value="${gameDetail.schLogo}" />
								<input id="gameEditP" type="hidden" value="${gameEditP}" />
								<input id="type" type="hidden" value="${type}" />

								<input type="text" class="form-control" id="gameName" name="gameName" value="${gameDetail.schName}" />
								<span class="help-block errorMsg" id="gameName-error">&nbsp;</span>
							</div>
						</div>
						<div class="form-group">
							<label for="gameName" class="col-sm-2 control-label"><span class="requiredMsg">*</span>开场时间</label>
							<div class="col-sm-10">
								<input type="hidden" id="schId" name="schId" value="${gameDetail.schId}" />
								<input type="hidden" id="schLogo" name="schLogo" value="${gameDetail.schLogo}" />
								<input id="gameEditP" type="hidden" value="${gameEditP}" />
								<input id="type" type="hidden" value="${type}" />

								<input type="text" class="form-control" id="gameName" name="gameName" value="${gameDetail.schName}" />
								<span class="help-block errorMsg" id="gameName-error">&nbsp;</span>
							</div>
						</div>
						<div class="form-group">
							<label for="gameName" class="col-sm-2 control-label"><span class="requiredMsg">*</span>地点</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="gameName" name="gameName" value="${gameDetail.schName}" />
								<span class="help-block errorMsg" id="gameName-error">&nbsp;</span>
							</div>
						</div>
						<div class="form-group">
							<label for="remark" class="col-sm-2 control-label">备注</label>
							<div class="col-sm-10">
								<textarea maxlength="200" name="remark" id="remark" class="form-control" rows="6">${gameDetail.introduction}</textarea>
							</div>
							<span class="help-block errorMsg" id="introduction-error">&nbsp;</span>
						</div>
					</form>
					
					
					<!--
                    	这个地方加入可编辑的table
                    	gameDetail只用来显示数据，这个页面用来添加和编辑
                    -->
					<div class="row">
						<div class="col-sm-2">
						</div>
						<div class="col-sm-10">
							<div style=" margin-left: auto; margin-right: auto;">
								<input id="btnEdit" name="btnEdit" type="button" onclick="gameDetail.gameAdd.handleEditBtn()" style="display:none;width: 100px;" class="btn btn-primary" value="编辑" />
								<input id="btnSave" name="btnSave" type="button" onclick="gameDetail.gameAdd.submitForm()" style="width: 100px;" class="btn btn-primary" value="保存" />
								<input type="button" onclick=" gameDetail.gameAdd.back()" style="width: 100px;" class="btn btn-primary" value="返回" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	<%@ include file="../common/common_footer.jsp" %>
	<%@ include file="../common/detail_footer.jsp" %>
	<script src="resources/js/game/gameDetail.js"></script>

</html>