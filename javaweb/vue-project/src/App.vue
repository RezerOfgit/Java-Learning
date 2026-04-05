<template>
  <div>
<!--    <element-view></element-view>-->
<!--    员工管理-->
    <emp-view></emp-view>
  </div>
</template>

<script>
// import ElementView from "@/views/element/ElementView.vue";
import EmpView from "@/views/tlias/EmpView.vue";
export default {
  components: { EmpView /*ElementView*/},
  data() { /* 简写, data: function () {*/
    return{
      message:"Hello Vue666"
    }
  },
  methods:{

  }
}
</script>

<style>

</style>
