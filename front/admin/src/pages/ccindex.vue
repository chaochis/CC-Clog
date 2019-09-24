<template>
    <ccnav></ccnav>
</template>
<script>
import ccnav from '@/components/ccnav'
import routeName from '../router/routename'
export default {
    name: 'ccmain',
    components: {ccnav},
    data() {
        return {
        }
    },
    created(){
      this.$router.pushstate({name:routeName.ccRegister})
    }
}
</script>

