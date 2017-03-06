<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title> - 表单验证 jQuery Validation</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="${ctx!}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${ctx!}/assets/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx!}/assets/css/animate.css" rel="stylesheet">
    <link href="${ctx!}/assets/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>jQuery Validate 简介</h5>
                    </div>
                    <div class="ibox-content">
                        <p>jquery.validate.js 是一款优秀的jQuery表单验证插件。它具有如下特点：</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>资源编辑</h5>
                    </div>
                    <div class="ibox-content">
                        <form class="form-horizontal m-t" id="frm" method="post" action="${ctx!}/admin/resource/edit">
                        	<input type="hidden" id="id" name="id" value="${resource.id}">
                            <div class="form-group">
                               <label class="col-sm-3 control-label">上级资源：</label>
                                <div class="col-sm-8">
                                	<select name="parent.id" class="form-control">
                                		<#list list as r>
                                			<option value="${r.id}" <#if resource.parent.id == r.id>selected="selected"</#if>>
                                				<#if r.level == 1>|-<#elseif  r.level == 2>　|-<#else>　　|-</#if>${r.name}
                                			</option>
                                		</#list>
                                	</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">资源名称：</label>
                                <div class="col-sm-8">
                                    <input id="name" name="name" class="form-control" type="text" value="${resource.name}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">唯一标识：</label>
                                <div class="col-sm-8">
                                    <input id="sourceKey" name="sourceKey" class="form-control" type="text" value="${resource.sourceKey}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">资源类型：</label>
                                <div class="col-sm-8">
                                	<select name="type" class="form-control">
                                		<option value="0" <#if resource.type == 0>selected="selected"</#if>>目录</option>
                                		<option value="1" <#if resource.type == 1>selected="selected"</#if>>菜单</option>
                                		<option value="2" <#if resource.type == 2>selected="selected"</#if>>按钮</option>
                                	</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">资源url：</label>
                                <div class="col-sm-8">
                                    <input id="sourceUrl" name="sourceUrl" class="form-control" value="${resource.sourceUrl}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">层级：</label>
                                <div class="col-sm-8">
                                    <input id="level" name="level" class="form-control" value="${resource.level}" placeholder="目录：1，菜单：2，按钮：3">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">排序：</label>
                                <div class="col-sm-8">
                                    <input id="sort" name="sort" class="form-control" value="${resource.sort}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">图标：</label>
                                <div class="col-sm-8">
                                    <input id="icon" name="icon" class="form-control" value="${resource.icon}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">状态：</label>
                                <div class="col-sm-8">
                                	<select name="isHide" class="form-control">
                                		<option value="0" <#if resource.locked == 0>selected="selected"</#if>>显示</option>
                                		<option value="1" <#if resource.locked == 1>selected="selected"</#if>>隐藏</option>
                                	</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">描述：</label>
                                <div class="col-sm-8">
                                    <input id="description" name="description" class="form-control" value="${resource.description}">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-8 col-sm-offset-3">
                                    <button class="btn btn-primary" type="submit">提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <!-- 全局js -->
    <script src="${ctx!}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${ctx!}/assets/js/bootstrap.min.js?v=3.3.6"></script>

    <!-- 自定义js -->
    <script src="${ctx!}/assets/js/content.js?v=1.0.0"></script>

    <!-- jQuery Validation plugin javascript-->
    <script src="${ctx!}/assets/js/plugins/validate/jquery.validate.min.js"></script>
    <script src="${ctx!}/assets/js/plugins/validate/messages_zh.min.js"></script>
    <script src="${ctx!}/assets/js/plugins/layer/layer.min.js"></script>
    <script src="${ctx!}/assets/js/plugins/layer/laydate/laydate.js"></script>
    <script type="text/javascript">
    $(document).ready(function () {
	  	
	    $("#frm").validate({
    	    rules: {
    	    	name: {
    	        required: true,
    	        minlength: 4,
    	    	maxlength: 20
    	      },
    	      	sourceKey: {
    	        required: true,
    	        minlength: 4,
    	    	maxlength: 40
    	      },
    	      	type: {
    	        required: true
    	      },
    	      	sourceUrl: {
    	        required: true
    	      },
    	      	level: {
    	        required: true,
    	        number:true
    	      },
    	      	sort: {
    	      	number:true,
    	        required: true
    	      },
    	      	icon: {
    	        maxlength: 40
    	      },
    	      	isHide: {
    	        required: true
    	      },
    	      	description: {
    	        required: true,
    	        maxlength: 40
    	      }
    	    },
    	    messages: {},
    	    submitHandler:function(form){
    	    	$.ajax({
   	    		   type: "POST",
   	    		   dataType: "json",
   	    		   url: "${ctx!}/admin/resource/edit",
   	    		   data: $(form).serialize(),
   	    		   success: function(msg){
	   	    			layer.msg(msg.message, {time: 2000},function(){
	   						var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	   						parent.layer.close(index); 
	   					});
   	    		   }
   	    		});
            } 
    	});
    });
    </script>

</body>

</html>
