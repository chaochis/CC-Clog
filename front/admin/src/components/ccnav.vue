<template>
    <div id="cc-nav">
      he
    </div>
</template>
<script>
import cclogin from './cclogin'
export default {
    name: 'cc-nav',
    components: {cclogin},
    data(){
        return {
            searchText: ""
        };
    },
    methods: {
        onSearch(){
            alert("1")
        }
    }
}
</script>
<style scoped>
.cc-nav-logo-text{
    color: #665544;
    font-size: 20px;
}

#cc-nav >>> .cc-nav-search-area{
    margin-left: 50%;
}
</style>



