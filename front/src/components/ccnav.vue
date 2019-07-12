<template>
    <div id="cc-nav">
        <el-menu mode="horizontal">
            <!-- <el-menu-item><el-image :src="logoSrc" style="width: 60px;height: 100px;"></el-image></el-menu-item> -->
            <el-menu-item><span class="cc-nav-logo-text">CC-Clog</span></el-menu-item>
            <el-menu-item class="cc-nav-search-area"><el-input placeholder="请输入搜索内容"></el-input></el-menu-item>
            <el-menu-item>首页</el-menu-item>
            <el-menu-item>产品区</el-menu-item>
            <el-menu-item>讨论区</el-menu-item>
            <el-menu-item class="cc-nav-login-area"><span>登录</span><el-divider direction="vertical"></el-divider><span>注册</span></el-menu-item>
        </el-menu>
    </div>
</template>
<script>
export default {
    name: 'cc-nav',
    data(){
        return {
            
        };
    }
}
</script>
<style scoped>
.cc-nav-logo-text{
    color: #665544;
    font-size: 20px;
}

#cc-nav >>> .cc-nav-login-area{
    color: red;
}

#cc-nav >>> .cc-nav-search-area{
    margin-left: 50%;
}
</style>



