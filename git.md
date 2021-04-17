## git
资源下载地址：http://npm.taobao.org/package/mirrors
### git配置
```shell
$ git config -l
输出内容如下：
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=E:/Program Files/Git/mingw64/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager-core
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
user.name=username
user.email=emaill@qq.com
http.http://git.code.oa.com.proxy=http://127.0.0.1:12639
http.https://git.code.oa.com.proxy=http://127.0.0.1:12639
core.repositoryformatversion=0
core.filemode=false
core.bare=false
core.logallrefupdates=true
core.symlinks=false
core.ignorecase=true
remote.origin.url=https://github.com/Asteven-zn/javaselearn.git
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*
branch.master.remote=origin
branch.master.merge=refs/heads/master
```

```shell
$ git config --system --list
输出内容如下：
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=E:/Program Files/Git/mingw64/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager-core
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
```

```shell
$ git config --global --list
输出内容如下：
user.name=Asteven-zn
user.email=964038167@qq.com
http.http://git.code.oa.com.proxy=http://127.0.0.1:12639
http.https://git.code.oa.com.proxy=http://127.0.0.1:12639
```

### git文件操作

> 文件的4种状态

![image-20210414201833158](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210414201833158.png)

![image-20210414202312076](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210414202312076.png)