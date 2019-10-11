<template>
  <div>
    <ccnav></ccnav>
    <cclogin></cclogin>
  </div>
</template>
<script>
import ccnav from '@/components/ccnav'
import routeName from '../router/routename'
import cclogin from '@/components/cclogin'
import axios from '../apis/apis'
export default {
    name: 'ccmain',
    components: {ccnav,cclogin},
    data() {
        return {
        }
    },
    created(){
      console.log(axios)
    }
}
</script>

