(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["chunk-35d45b48"], {
    2953: function (e, t, a) {
        "use strict";
        a.r(t);
        var r = function () {
            var e = this, t = e.$createElement, a = e._self._c || t;
            return a("el-card", {staticClass: "grade"}, [a("div", [a("el-form", {
                attrs: {inline: ""},
                nativeOn: {
                    submit: function (e) {
                        e.preventDefault()
                    }
                }
            }, [a("el-form-item", [a("el-button", {
                attrs: {type: "primary", icon: "el-icon-plus", size: "small"},
                on: {click: e.showAdd}
            }, [e._v("Add")]), a("el-popconfirm", {
                attrs: {title: "Want to Delete?"},
                on: {onConfirm: e.removeBatch}
            }, [a("el-button", {
                staticStyle: {"margin-left": "10px"},
                attrs: {
                    slot: "reference",
                    disabled: 0 === e.selectedList.length,
                    type: "danger",
                    icon: "el-icon-delete",
                    size: "small"
                },
                slot: "reference"
            }, [e._v("Bulk Delete")])], 1)], 1), a("el-form-item", {attrs: {label: "Admin Name:"}}, [a("el-input", {
                attrs: {
                    placeholder: "Insert Admin name",
                    size: "small"
                }, model: {
                    value: e.searchParams.adminName, callback: function (t) {
                        e.$set(e.searchParams, "adminName", t)
                    }, expression: "searchParams.adminName"
                }
            })], 1), a("el-form-item", [a("el-button", {
                attrs: {type: "primary", icon: "el-icon-search", size: "small"},
                on: {click: e.search}
            }, [e._v("Search")]), a("el-button", {
                attrs: {type: "info", icon: "el-icon-brush", size: "small"},
                on: {click: e.resetParams}
            }, [e._v("Reset")])], 1)], 1), a("el-table", {
                directives: [{
                    name: "loading",
                    rawName: "v-loading",
                    value: e.listLoading,
                    expression: "listLoading"
                }], attrs: {data: e.list, "row-key": "id", border: ""}, on: {
                    "selection-change": function (t) {
                        e.selectedList = t
                    }
                }
            }, [a("el-table-column", {
                attrs: {
                    align: "center",
                    type: "selection",
                    width: "60"
                }
            }), a("el-table-column", {
                attrs: {
                    label: "ID",
                    prop: "id",
                    width: "80"
                }
            }), a("el-table-column", {
                attrs: {
                    label: "Name",
                    prop: "name",
                    width: "100"
                }
            }), a("el-table-column", {
                attrs: {
                    label: "Gender",
                    prop: "gender",
                    width: "100"
                }
            }), a("el-table-column", {
                attrs: {
                    label: "Email",
                    width: "150",
                    prop: "email"
                }
            }), a("el-table-column", {
                attrs: {
                    label: "Phone",
                    width: "120",
                    prop: "telephone"
                }
            }), a("el-table-column", {
                attrs: {
                    label: "Address",
                    width: "120",
                    prop: "address"
                }
            }), a("el-table-column", {
                attrs: {label: "Avatar", width: "100"},
                scopedSlots: e._u([{
                    key: "default", fn: function (e) {
                        var t = e.row;
                        return [a("el-image", {
                            staticStyle: {width: "100px", height: "100px"},
                            attrs: {src: t.portraitPath}
                        })]
                    }
                }])
            }), a("el-table-column", {
                attrs: {label: "Action", width: "150", align: "left", fixed: "right"},
                scopedSlots: e._u([{
                    key: "default", fn: function (t) {
                        var r = t.row;
                        return [a("el-button", {
                            attrs: {size: "small", type: "warning"}, on: {
                                click: function (t) {
                                    return e.showUpdate(r)
                                }
                            }
                        }, [e._v("Edit")]), a("el-popconfirm", {
                            attrs: {title: "Confirm delete " + r.name + " ?"},
                            on: {
                                onConfirm: function (t) {
                                    return e.remove(r.id)
                                }
                            }
                        }, [a("el-button", {
                            staticStyle: {"margin-left": "10px"},
                            attrs: {slot: "reference", type: "danger", size: "mini"},
                            slot: "reference"
                        }, [e._v("Delete")])], 1)]
                    }
                }])
            })], 1), a("el-pagination", {
                staticStyle: {padding: "20px 0", "text-align": "center"},
                attrs: {
                    "current-page": e.searchParams.pageNo,
                    total: e.total,
                    "page-size": e.searchParams.pageSize,
                    "page-sizes": [3, 6, 9],
                    layout: "prev, pager, next, jumper, ->, sizes, total"
                },
                on: {"current-change": e.handleCurrentChange, "size-change": e.handleSizeChange}
            })], 1), a("el-dialog", {
                attrs: {
                    title: e.form.id ? "Edit Admin info" : "Add Admin info",
                    visible: e.dialogVisible,
                    width: "40%"
                }, on: {
                    "update:visible": function (t) {
                        e.dialogVisible = t
                    }
                }
            }, [a("el-form", {
                ref: "form",
                staticStyle: {width: "90%"},
                attrs: {model: e.form, rules: e.rules, "label-width": "100px"}
            }, [a("el-form-item", {
                attrs: {
                    label: "Name",
                    prop: "name"
                }
            }, [a("el-input", {
                attrs: {placeholder: "Insert Name"}, model: {
                    value: e.form.name, callback: function (t) {
                        e.$set(e.form, "name", t)
                    }, expression: "form.name"
                }
            })], 1), a("el-form-item", {
                attrs: {
                    label: "Gender",
                    prop: "gender"
                }
            }, [a("el-select", {
                attrs: {placeholder: "Select Gender"},
                model: {
                    value: e.form.gender, callback: function (t) {
                        e.$set(e.form, "gender", t)
                    }, expression: "form.gender"
                }
            }, [a("el-option", {attrs: {label: "Male", value: "M"}}), a("el-option", {
                attrs: {
                    label: "Female",
                    value: "F"
                }
            })], 1)], 1), e.form.id ? e._e() : a("el-form-item", {
                attrs: {
                    label: "Password",
                    prop: "password"
                }
            }, [a("el-input", {
                attrs: {type: "password", placeholder: "Insert password"},
                model: {
                    value: e.form.password, callback: function (t) {
                        e.$set(e.form, "password", t)
                    }, expression: "form.password"
                }
            })], 1), e.form.id ? e._e() : a("el-form-item", {
                attrs: {
                    label: "Password",
                    prop: "password2"
                }
            }, [a("el-input", {
                attrs: {type: "password", placeholder: "Insert password"},
                model: {
                    value: e.form.password2, callback: function (t) {
                        e.$set(e.form, "password2", t)
                    }, expression: "form.password2"
                }
            })], 1), a("el-form-item", {
                attrs: {
                    label: "Email",
                    prop: "email"
                }
            }, [a("el-input", {
                attrs: {placeholder: "Insert Email"}, model: {
                    value: e.form.email, callback: function (t) {
                        e.$set(e.form, "email", t)
                    }, expression: "form.email"
                }
            })], 1), a("el-form-item", {
                attrs: {
                    label: "Phone",
                    prop: "telephone"
                }
            }, [a("el-input", {
                attrs: {placeholder: "Insert Phone"},
                model: {
                    value: e.form.telephone, callback: function (t) {
                        e.$set(e.form, "telephone", t)
                    }, expression: "form.telephone"
                }
            })], 1), a("el-form-item", {
                attrs: {
                    label: "Address",
                    prop: "address"
                }
            }, [a("el-input", {
                attrs: {placeholder: "Insert Address"},
                model: {
                    value: e.form.address, callback: function (t) {
                        e.$set(e.form, "address", t)
                    }, expression: "form.address"
                }
            })], 1), a("el-form-item", {
                attrs: {
                    label: "Avatar",
                    prop: "portraitPath"
                }
            }, [a("el-upload", {
                staticClass: "avatar-uploader",
                attrs: {
                    action: e.$BASE_API + "/sms/system/headerImgUpload",
                    name: "multipartFile",
                    "show-file-list": !1,
                    "on-success": e.handleAvatarSuccess,
                    "before-upload": e.beforeAvatarUpload
                }
            }, [e.form.portraitPath ? a("img", {
                staticClass: "avatar",
                attrs: {src: e.form.portraitPath}
            }) : a("i", {staticClass: "el-icon-plus avatar-uploader-icon"}), a("div", {
                staticClass: "el-upload__tip",
                attrs: {slot: "tip"},
                slot: "tip"
            }, [e._v("Only jpg/png files can be uploaded, and no more than 10MB")])])], 1)], 1), a("div", {
                attrs: {slot: "footer"},
                slot: "footer"
            }, [a("el-button", {on: {click: e.reset}}, [e._v("Reset")]), a("el-button", {
                attrs: {type: "primary"},
                on: {click: e.confirm}
            }, [e._v("OK")])], 1)], 1)], 1)
        }, s = [], i = (a("c975"), a("d81d"), a("96cf"), a("1da1")), o = a("5530"), n = {
            name: "AdminManage", data: function () {
                return {
                    listLoading: !1,
                    searchParams: {pageNo: 1, pageSize: 3, adminName: null},
                    total: 0,
                    list: [],
                    selectedList: [],
                    dialogVisible: !1,
                    form: {
                        name: "",
                        gender: "",
                        password: "",
                        password2: "",
                        email: "",
                        telephone: "",
                        address: "",
                        portraitPath: ""
                    },
                    rules: {
                        name: [{required: !0, message: "Administrator name is required"}, {
                            min: 2,
                            message: "Administrator name cannot be less than 2 characters"
                        }],
                        gender: [{required: !0, message: "Gender must be selected"}],
                        password: [{required: !0, message: "password is required"}, {min: 6, message: "Password cannot be less than 6 characters"}],
                        password2: [{required: !0, message: "Must enter confirmation password"}, {validator: this.validatePwd2}],
                        email: [{required: !0, message: "Administrator email must be entered"}, {
                            type: "email",
                            message: "Not a valid email format"
                        }],
                        telephone: [{required: !0, message: "Admin phone must be entered"}, {
                            pattern: /^[1]([3-9])[0-9]{9}$/,
                            message: "Not a legal phone number format"
                        }],
                        address: [{required: !0, message: "Administrator address must be entered"}],
                        portraitPath: [{required: !0, message: "Avatar must be uploaded"}]
                    }
                }
            }, mounted: function () {
                this.getList()
            }, methods: {
                validatePwd2: function (e, t, a) {
                    t != this.form.password ? a("Confirm password must be the same as password") : a()
                }, resetParams: function () {
                    this.searchParams = {pageNo: 1, pageSize: 3, adminName: null}, this.getList()
                }, showAdd: function () {
                    var e = this;
                    this.form = {
                        name: "",
                        gender: "",
                        password: "",
                        password2: "",
                        email: "",
                        telephone: "",
                        address: "",
                        portraitPath: null
                    }, this.dialogVisible = !0, this.$nextTick((function () {
                        return e.$refs.form.clearValidate()
                    }))
                }, showUpdate: function (e) {
                    this.form = Object(o["a"])({}, e), this.dialogVisible = !0
                }, remove: function (e) {
                    var t = this;
                    return Object(i["a"])(regeneratorRuntime.mark((function a() {
                        return regeneratorRuntime.wrap((function (a) {
                            while (1) switch (a.prev = a.next) {
                                case 0:
                                    return a.next = 2, t.$API.admin.removeBatch([e]);
                                case 2:
                                    t.$message.success("successfully deleted"), 1 === t.list.length && t.searchParams.pageNo > 1 && t.searchParams.pageNo--, t.getList();
                                case 5:
                                case"end":
                                    return a.stop()
                            }
                        }), a)
                    })))()
                }, removeBatch: function () {
                    var e = this;
                    return Object(i["a"])(regeneratorRuntime.mark((function t() {
                        var a;
                        return regeneratorRuntime.wrap((function (t) {
                            while (1) switch (t.prev = t.next) {
                                case 0:
                                    return a = e.selectedList.map((function (e) {
                                        return e.id
                                    })), t.next = 3, e.$API.admin.removeBatch(a);
                                case 3:
                                    e.$message.success("successfully deleted"), e.list.length === e.selectedList.length && e.searchParams.pageNo > 1 && e.searchParams.pageNo--, e.getList();
                                case 6:
                                case"end":
                                    return t.stop()
                            }
                        }), t)
                    })))()
                }, reset: function () {
                    this.form = Object(o["a"])(Object(o["a"])({}, this.form), {}, {
                        name: "",
                        gender: "",
                        password: this.form.id ? this.form.password : null,
                        password2: this.form.id ? this.form.password2 : null,
                        email: "",
                        telephone: "",
                        address: "",
                        portraitPath: ""
                    })
                }, confirm: function () {
                    var e = this;
                    this.$refs.form.validate(function () {
                        var t = Object(i["a"])(regeneratorRuntime.mark((function t(a) {
                            var r;
                            return regeneratorRuntime.wrap((function (t) {
                                while (1) switch (t.prev = t.next) {
                                    case 0:
                                        if (!a) {
                                            t.next = 8;
                                            break
                                        }
                                        return t.next = 3, e.$API.admin.save(e.form);
                                    case 3:
                                        r = !!e.form.id, e.dialogVisible = !1, e.$message.success("".concat(r ? "Edit" : "Add", "success")), r || (e.searchParams.pageNo = 1), e.getList();
                                    case 8:
                                    case"end":
                                        return t.stop()
                                }
                            }), t)
                        })));
                        return function (e) {
                            return t.apply(this, arguments)
                        }
                    }())
                }, getList: function () {
                    var e = this;
                    return Object(i["a"])(regeneratorRuntime.mark((function t() {
                        var a, r, s, i;
                        return regeneratorRuntime.wrap((function (t) {
                            while (1) switch (t.prev = t.next) {
                                case 0:
                                    return e.listLoading = !0, t.next = 3, e.$API.admin.getList(e.searchParams);
                                case 3:
                                    a = t.sent, e.listLoading = !1, r = a.data, s = r.total, i = r.records, e.total = s, e.list = i;
                                case 8:
                                case"end":
                                    return t.stop()
                            }
                        }), t)
                    })))()
                }, search: function () {
                    this.searchParams.pageNo = 1, this.searchParams.pageSize = 3, this.getList()
                }, handleCurrentChange: function (e) {
                    this.searchParams.pageNo = e, this.getList()
                }, handleSizeChange: function (e) {
                    this.searchParams.pageSize = e, this.searchParams.pageNo = 1, this.getList()
                }, handleAvatarSuccess: function (e, t) {
                    this.form.portraitPath = e.data, this.$refs.ruleForm.validateField("portraitPath")
                }, beforeAvatarUpload: function (e) {
                    var t = ["image/jpeg", "image/png"].indexOf(e.type) >= 0, a = e.size / 1024 / 1024 < 10;
                    return t || this.$message.error("The uploaded avatar picture can only be in JPG/PNG format!"), a || this.$message.error("The size of the uploaded avatar picture cannot exceed 10MB!"), t && a
                }
            }
        }, l = n, c = (a("e6ac"), a("2877")), m = Object(c["a"])(l, r, s, !1, null, "849454b8", null);
        t["default"] = m.exports
    }, "9a2e": function (e, t, a) {
    }, d81d: function (e, t, a) {
        "use strict";
        var r = a("23e7"), s = a("b727").map, i = a("1dde"), o = a("ae40"), n = i("map"), l = o("map");
        r({target: "Array", proto: !0, forced: !n || !l}, {
            map: function (e) {
                return s(this, e, arguments.length > 1 ? arguments[1] : void 0)
            }
        })
    }, e6ac: function (e, t, a) {
        "use strict";
        a("9a2e")
    }
}]);