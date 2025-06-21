const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooti1986q06/",
            name: "springbooti1986q06",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooti1986q06/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧养老服务系统"
        } 
    }
}
export default base
