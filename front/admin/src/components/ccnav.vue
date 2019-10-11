<template>
    <div id="cc-nav">
    </div>
</template>
<script>
import cclogin from './cclogin'
import axios from '../apis/apis'
export default {
    name: 'cc-nav',
    components: {cclogin},
    data(){
        return {
            searchText: ""
        };
    },
    created () {
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



