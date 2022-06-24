document.addEventListener("DOMContentLoaded", () => {
  const memo_table = document.querySelector("table.memo");
  console.log("memo", memo_table);

  memo_table?.addEventListener("click", (e) => {
    const td = e.target;
    if (td.tagName === "TD") {
      const tr = td.closest("TR");
      const m_seq = tr.dataset.m_seq;

      document.location.href = `${rootPath}/${m_seq}/detail`;
    }
  });
});
